package com.intellify.taskmanagementapp.data.remote

import com.google.gson.JsonElement
import com.intellify.taskmanagementapp.data.local.entity.Task
import com.intellify.taskmanagementapp.data.model.TaskRes
import okhttp3.RequestBody
import org.json.JSONObject
import retrofit2.Response
import retrofit2.http.*

interface ApiServices {
    @GET(ApiConstants.GLITCH_TASKS)
    suspend fun getTasks(): Response<ArrayList<Task>>

    @POST(ApiConstants.ADD_TASK)
    suspend fun addTasks(@Body body : RequestBody): Response<TaskRes>

    @POST(ApiConstants.ADD_TASK)
    suspend fun updateTasks(@Body body : Map<String, String>): Response<TaskRes>
}