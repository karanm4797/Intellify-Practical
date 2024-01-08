package com.intellify.taskmanagementapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.intellify.taskmanagementapp.data.local.dao.TaskDao
import com.intellify.taskmanagementapp.data.local.entity.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}