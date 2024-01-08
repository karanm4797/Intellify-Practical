package com.intellify.taskmanagementapp.data.model

import com.google.gson.annotations.SerializedName
import com.intellify.taskmanagementapp.data.local.entity.Task

data class TaskRes(
    @SerializedName("message") var message: String? = null,
    @SerializedName("task") var task: Task? = Task()
)