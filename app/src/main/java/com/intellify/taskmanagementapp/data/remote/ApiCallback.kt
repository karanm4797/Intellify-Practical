package com.intellify.taskmanagementapp.data.remote

sealed class ApiCallback<T>(val data: T? = null, val message: String? = null) {
    class OnSuccess<T>(data: T?) : ApiCallback<T>(data)
    class OnError<T>(message: String?, data: T? = null) : ApiCallback<T>(data, message)
}