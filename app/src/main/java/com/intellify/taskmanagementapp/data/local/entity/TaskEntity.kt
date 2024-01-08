package com.intellify.taskmanagementapp.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "task")
data class Task(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "task_id")
    @SerializedName("task_id")
    var taskId: Int = 0,
    @ColumnInfo(name = "task_name")
    @SerializedName("task_name")
    var taskName: String = "",
    @ColumnInfo(name = "created_date")
    @SerializedName("created_date")
    var createdDate: String = "",
    @ColumnInfo(name = "updated_date")
    @SerializedName("updated_date")
    var updatedDate: String = "",
    @ColumnInfo(name = "task_details")
    @SerializedName("task_details")
    var taskDetails: String = "",
    @ColumnInfo(name = "is_synced")
    var isSynced: Boolean = false
) : Serializable