package com.intellify.taskmanagementapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TaskManagementApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}