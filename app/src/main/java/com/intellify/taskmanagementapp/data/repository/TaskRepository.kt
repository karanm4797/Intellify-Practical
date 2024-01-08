package com.intellify.taskmanagementapp.data.repository

import android.content.Context
import android.util.Log
import com.android.skeleton.utils.Utils
import com.intellify.taskmanagementapp.data.local.dao.TaskDao
import com.intellify.taskmanagementapp.data.local.entity.Task
import com.intellify.taskmanagementapp.data.model.TaskRes
import com.intellify.taskmanagementapp.data.remote.ApiCallback
import com.intellify.taskmanagementapp.data.remote.ApiServices
import com.squareup.moshi.Json
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import retrofit2.Response
import java.util.Calendar
import javax.inject.Inject

@Module
@InstallIn(SingletonComponent::class)
class TaskRepository @Inject constructor(
    @ApplicationContext val context: Context,
    private val apiServices: ApiServices,
    private var taskDao: TaskDao,
) {

    private suspend fun <T> parseResponse(
        flowCollector: FlowCollector<ApiCallback<T>>,
        apiCall: suspend () -> Response<T>
    ) {

        try {
            val response = apiCall.invoke()

            if (response.isSuccessful) {
                flowCollector.emit(ApiCallback.OnSuccess(response.body()))
            } else {
                Log.e("API_ERROR", response.message())
                flowCollector.emit(ApiCallback.OnError(response.message()))
            }
        } catch (e: java.lang.Exception) {
            flowCollector.emit(ApiCallback.OnError(e.message.toString()))
        }
    }

    suspend fun getTasks(): Flow<ApiCallback<ArrayList<Task>>> {
        return flow {
            if (Utils.isOnline(context)) {
                parseResponse(this) { apiServices.getTasks() }
            } else {
                emit(ApiCallback.OnSuccess(taskDao.getAll() as ArrayList<Task>))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun addTasks(task: TaskRes): Flow<ApiCallback<TaskRes>> {
        return flow {
            if (Utils.isOnline(context)) {
                parseResponse(this) {

                    val mediaType: MediaType? = "application/json; charset=utf-8".toMediaTypeOrNull()
                    val requestBody: RequestBody = JSONObject().apply {
                        put("task_name", task.task!!.taskName)
                        put("task_details", task.task!!.taskDetails)
                    }.toString().toRequestBody(mediaType)
                    apiServices.addTasks(requestBody)
                }
            } else {
                taskDao.addTask(task.task!!)
                emit(ApiCallback.OnSuccess(task))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun updateTasks(task: TaskRes): Flow<ApiCallback<TaskRes>> {
        return flow<ApiCallback<TaskRes>> {
            if (Utils.isOnline(context)) {
                parseResponse(this) {
                    val mediaType: MediaType? = "application/json; charset=utf-8".toMediaTypeOrNull()
                    val requestBody: RequestBody = JSONObject().apply {
                        put("task_id", task.task!!.taskId)
                        put("task_name", task.task!!.taskName)
                        put("task_details", task.task!!.taskDetails)
                    }.toString().toRequestBody(mediaType)
                    apiServices.addTasks(requestBody)
                }
            } else {
                taskDao.updateTask(task.task!!)
                emit(ApiCallback.OnSuccess(task))
            }
        }.flowOn(Dispatchers.IO)
    }
}