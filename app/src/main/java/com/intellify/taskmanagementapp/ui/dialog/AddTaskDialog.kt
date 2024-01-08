package com.intellify.taskmanagementapp.ui.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.bind
import androidx.databinding.DataBindingUtil.inflate
import androidx.fragment.app.DialogFragment
import com.intellify.taskmanagementapp.R
import com.intellify.taskmanagementapp.databinding.DialogAddTaskBinding

class AddTaskDialog(
    val title: String,
    val desc: String,
    val onAddTaskClick: (String, String) -> Unit
) : DialogFragment() {

    private lateinit var binding: DialogAddTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = inflate(inflater, R.layout.dialog_add_task, container, false)
        init()
        return binding.root
    }

    private fun init() {

        binding.edtAddTask.setText(title)
        binding.edtAddTaskDesc.setText(desc)
        if(title != ""){
            binding.btnAddTask.text = "Update Task"
        }
        else{
            binding.btnAddTask.text = "Add Task"
        }

        binding.btnAddTask.setOnClickListener {
            onAddTaskClick(
                binding.edtAddTask.text.toString(),
                binding.edtAddTaskDesc.text.toString()
            )
            dismiss()
        }
    }
}