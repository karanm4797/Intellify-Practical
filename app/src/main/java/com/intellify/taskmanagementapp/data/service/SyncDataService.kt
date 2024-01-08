package com.intellify.taskmanagementapp.data.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkerParameters
import com.android.skeleton.utils.Utils
import com.intellify.taskmanagementapp.R
import com.intellify.taskmanagementapp.data.local.dao.TaskDao
import com.intellify.taskmanagementapp.data.local.entity.Task
import com.intellify.taskmanagementapp.data.remote.ApiCallback
import com.intellify.taskmanagementapp.data.remote.ApiServices
import com.intellify.taskmanagementapp.ui.activity.TasksAct
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class SyncDataService @Inject constructor(
) : Service() {

    private val NOTIFICATION_CHANNEL_ID = "sync_channel"

    private fun createNotification(context: Context): Notification {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val channel = NotificationChannel(
                NOTIFICATION_CHANNEL_ID,
                "Sync Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Channel for data sync"
                enableLights(true)
                lightColor = R.color.teal_700
                enableVibration(true)
            }
            notificationManager.createNotificationChannel(channel)
        }

        val intent = Intent(context, TasksAct::class.java)
        val pendingIntent = PendingIntent.getActivity(
            context, 0, intent,
            PendingIntent.FLAG_IMMUTABLE
        )

        return NotificationCompat.Builder(context, NOTIFICATION_CHANNEL_ID)
            .setContentTitle("Syncing data with server")
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentIntent(pendingIntent)
            .setProgress(0, 0, true) // Indeterminate progress bar
            .setAutoCancel(true).build()
    }

    override fun onCreate() {
        super.onCreate()

        startForeground(1, createNotification(context = applicationContext))
        startWork()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    private fun startWork() {
        val workRequest = OneTimeWorkRequestBuilder<SyncDataWorker>().build()
        WorkManager.getInstance(applicationContext).enqueue(workRequest)
    }
}

@HiltWorker
class SyncDataWorker @AssistedInject constructor(
    @Assisted var context: Context,
    @Assisted workerParams: WorkerParameters,
    private var apiServices: ApiServices,
    private var taskDao: TaskDao,

    ) : CoroutineWorker(context, workerParams) {
    override suspend fun doWork(): Result {

        runBlocking {
            syncData()
        }
        return Result.success()
    }

    private suspend fun <T> parseResponse(
        apiCall: suspend () -> Response<T>
    ): ApiCallback<T> {

        return try {
            if (Utils.isOnline(context)) {
                val response = apiCall.invoke()

                if (response.isSuccessful) {
                    ApiCallback.OnSuccess(response.body())
                } else {
                    Log.e("API_ERROR", response.message())
                    ApiCallback.OnError(response.message())
                }
            } else {
                ApiCallback.OnError("No internet available")
            }
        } catch (e: java.lang.Exception) {
            ApiCallback.OnError(e.message.toString())
        }
    }

    private suspend fun syncData() {

        val listServer = parseResponse { apiServices.getTasks() }
        Log.e("SERVER_DATA_RECEIVED", JSONArray(listServer.data).toString())
        val pendingToSyncList: ArrayList<Task>
        if (listServer.data == null) {
            return
        } else {
            val listLocal = taskDao.getAll()
            Log.e("LOCAL_DATA_RECEIVED", JSONArray(listLocal).toString())
            pendingToSyncList = listLocal.filter { !it.isSynced } as ArrayList<Task>
            val listNewRecordsServer = listServer.data.subtract(listLocal.toSet())
            Log.e("LIST_SUBTRACTED", JSONArray(listNewRecordsServer).toString())
            Log.e("LIST_FILTERED", JSONArray(pendingToSyncList).toString())
            listNewRecordsServer.forEach {
                taskDao.addTask(it)
            }
            pendingToSyncList.forEach {

                parseResponse() {

                    val mediaType: MediaType? =
                        "application/json; charset=utf-8".toMediaTypeOrNull()
                    val requestBody: RequestBody = JSONObject().apply {
                        if (it.taskId != 0) {
                            put("task_Id", it.taskName)
                        }
                        put("task_name", it.taskName)
                        put("task_details", it.taskDetails)
                    }.toString().toRequestBody(mediaType)

                    apiServices.addTasks(requestBody)
                }
            }
        }
    }
}