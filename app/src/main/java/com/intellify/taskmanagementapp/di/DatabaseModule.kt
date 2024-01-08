package com.intellify.taskmanagementapp.di

import android.content.Context
import androidx.room.Room.databaseBuilder
import com.intellify.taskmanagementapp.data.local.AppDatabase
import com.intellify.taskmanagementapp.data.local.dao.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    fun taskDao(@ApplicationContext appContext: Context): TaskDao {
        return databaseBuilder(
            appContext,
            AppDatabase::class.java, "task-database"
        ).build().taskDao()
    }
}