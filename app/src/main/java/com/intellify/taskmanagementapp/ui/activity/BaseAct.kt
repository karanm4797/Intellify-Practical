package com.intellify.taskmanagementapp.ui.activity

import android.os.Bundle
import android.view.Gravity.TOP
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.google.android.material.snackbar.Snackbar
import com.intellify.taskmanagementapp.BR
import com.intellify.taskmanagementapp.R
import com.intellify.taskmanagementapp.ui.viewmodel.BaseVM
import com.intellify.taskmanagementapp.utils.Progress

abstract class BaseAct<binding : ViewDataBinding, VM : BaseVM>(@LayoutRes private val layoutId: Int) :
    AppCompatActivity(), View.OnClickListener {

    protected lateinit var binding: binding
    protected abstract val vm: VM?

    private lateinit var progress: Progress

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<binding>(this, layoutId).apply {
            lifecycleOwner = this@BaseAct
        }
        vm?.let {
            binding.setVariable(BR.vm, it)
        }
        binding.setVariable(BR.click, this@BaseAct)
        setProgressbar()
        init()
    }


    abstract fun init()

    override fun onClick(v: View?) {

    }

    private fun setProgressbar() {
        progress = Progress(this)
        progress.setCancelable(false)
    }

    fun showProgress() {

        progress.show()
    }

    fun hideProgress() {

        progress.hide()
    }

    fun showSnackBar(message: String) {

        val viewGroup =
            (findViewById<View>(android.R.id.content) as ViewGroup).getChildAt(0) as ViewGroup

        val snackBarView = Snackbar.make(viewGroup.getChildAt(0), message, Snackbar.LENGTH_LONG)
            .setBackgroundTint(
                resources.getColor(
                    R.color.teal_700, null
                )
            )
        val layoutParams = snackBarView.view.layoutParams as FrameLayout.LayoutParams
        layoutParams.gravity = TOP
        snackBarView.view.layoutParams = layoutParams
        snackBarView.show()
    }
}