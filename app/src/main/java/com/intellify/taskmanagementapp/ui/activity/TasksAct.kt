package com.intellify.taskmanagementapp.ui.activity

import android.content.Intent
import android.view.View
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.intellify.taskmanagementapp.R
import com.intellify.taskmanagementapp.data.local.entity.Task
import com.intellify.taskmanagementapp.data.remote.ApiCallback
import com.intellify.taskmanagementapp.data.service.SyncDataService
import com.intellify.taskmanagementapp.databinding.ActivityTasksBinding
import com.intellify.taskmanagementapp.ui.adapter.TasksRVAdapter
import com.intellify.taskmanagementapp.ui.dialog.AddTaskDialog
import com.intellify.taskmanagementapp.ui.viewmodel.TasksVM
import dagger.hilt.android.AndroidEntryPoint
import java.util.Calendar

@AndroidEntryPoint
class TasksAct : BaseAct<ActivityTasksBinding, TasksVM>(R.layout.activity_tasks) {

    override val vm: TasksVM by viewModels()
    private lateinit var adapter: TasksRVAdapter

    override fun init() {

        binding.vm = vm
        adapter = TasksRVAdapter(arrayListOf()) {
            showAddOrUpdateTaskDialog(it)
        }
        binding.rvTasks.adapter = adapter
        showProgress()
        vm.getTasks().observe(this) {
            hideProgress()
            when (it) {
                is ApiCallback.OnError -> {
                    showSnackBar("Something went wrong")
                }

                is ApiCallback.OnSuccess -> {
                    showHideRecyclerView(it.data!!.size)
                    adapter.setTaskList(taskList = it.data)
                }
            }
        }

        binding.fabAddTask.setOnClickListener {
            showAddOrUpdateTaskDialog()
        }
    }

    private fun showHideRecyclerView(size: Int) {
        if (size == 0) {
            binding.rvTasks.visibility = View.GONE
            binding.txtNoTasks.visibility = View.VISIBLE
        } else {
            binding.rvTasks.visibility = View.VISIBLE
            binding.txtNoTasks.visibility = View.GONE
        }
    }

    private fun showAddOrUpdateTaskDialog(
        position: Int = -1,
    ) {
        AddTaskDialog(
            if (position != -1) adapter.getList()[position].taskName else "",
            if (position != -1) adapter.getList()[position].taskDetails else ""
        ) { addedTitle, description ->
            showProgress()
            if (position == -1) {
                addOrUpdateTask(
                    false,
                    Task(
                        taskName = addedTitle,
                        taskDetails = description,
                        createdDate = Calendar.getInstance().time.toString(),
                        updatedDate = Calendar.getInstance().time.toString(),
                    )
                )
            } else {
                addOrUpdateTask(
                    true, Task(
                        taskId = adapter.getList()[position].taskId,
                        taskName = addedTitle,
                        taskDetails = description,
                        createdDate = adapter.getList()[position].createdDate,
                        updatedDate = Calendar.getInstance().time.toString(),
                    )
                )
            }
        }.show(supportFragmentManager, "AddTaskDialog")
    }

    private fun addOrUpdateTask(isUpdate: Boolean, task: Task) {

        vm.addOrUpdateTask(isUpdate, task)
            .observe(this) {
                hideProgress()
                when (it) {
                    is ApiCallback.OnError -> {
                        showSnackBar("Something went wrong")
                    }

                    is ApiCallback.OnSuccess -> {
                        if (isUpdate) {
                            showSnackBar("Data updated successfully and started syncing data with server")
                            val list = adapter.getList()
                            list[list.indexOfFirst { oldTask -> oldTask.taskId == task.taskId }] =
                                it.data!!.task!!
                            showHideRecyclerView(list.size)
                            adapter.setTaskList(taskList = list)


                            val serviceIntent = Intent(this, SyncDataService::class.java)
                            ContextCompat.startForegroundService(this, serviceIntent)
                        } else {
                            showSnackBar("Data added successfully")
                            val list = adapter.getList().apply {
                                this.add(it.data!!.task!!)
                            }
                            showHideRecyclerView(list.size)
                            adapter.setTaskList(taskList = list)
                        }
                    }
                }
            }
    }
}