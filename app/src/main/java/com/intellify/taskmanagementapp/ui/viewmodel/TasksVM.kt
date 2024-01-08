package com.intellify.taskmanagementapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellify.taskmanagementapp.data.local.entity.Task
import com.intellify.taskmanagementapp.data.model.TaskRes
import com.intellify.taskmanagementapp.data.remote.ApiCallback
import com.intellify.taskmanagementapp.data.repository.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class TasksVM @Inject constructor(
    private var taskRepository: TaskRepository,
) : BaseVM() {

    fun getTasks(): LiveData<ApiCallback<ArrayList<Task>>> {

        val liveData = MutableLiveData<ApiCallback<ArrayList<Task>>>()
        viewModelScope.launch {
            taskRepository.getTasksFromServer().collect {
                liveData.postValue(it)
            }
        }
        return liveData
    }

    fun addOrUpdateTask(
        isUpdate: Boolean,
        task: Task
    ): LiveData<ApiCallback<TaskRes>> {

        return if (isUpdate) {
            updateTask(task)
        } else {
            addTask(task)
        }
    }

    private fun addTask(task: Task): LiveData<ApiCallback<TaskRes>> {

        val liveData = MutableLiveData<ApiCallback<TaskRes>>()
        viewModelScope.launch {

            taskRepository.addTasks(TaskRes(task = task)).collect {
                liveData.postValue(it)
            }
        }
        return liveData
    }

    private fun updateTask(task: Task): LiveData<ApiCallback<TaskRes>> {

        val liveData = MutableLiveData<ApiCallback<TaskRes>>()
        viewModelScope.launch {
            task.isSynced = false
            taskRepository.updateTasks(TaskRes(task = task)).collect {
                liveData.postValue(it)
            }
        }
        return liveData
    }
}