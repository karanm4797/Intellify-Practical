package com.intellify.taskmanagementapp.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intellify.taskmanagementapp.data.local.entity.Task
import com.intellify.taskmanagementapp.databinding.TaskItemBinding

@SuppressLint("NotifyDataSetChanged")
class TasksRVAdapter(
    private var list: ArrayList<Task>,
    private val onItemClicked: (Int) -> Unit
) :
    RecyclerView.Adapter<TasksRVAdapter.TasksViewHolder>() {

    class TasksViewHolder(internal val binding: TaskItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
        val binding = TaskItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TasksViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {

        with(holder.binding) {
            task = list[position]
            clTask.setOnClickListener {
                onItemClicked(position)
            }
        }
    }

    fun setTaskList(taskList: ArrayList<Task>) {

        list = taskList
        notifyDataSetChanged()
    }

    fun getList(): ArrayList<Task> {
        return list
    }
}