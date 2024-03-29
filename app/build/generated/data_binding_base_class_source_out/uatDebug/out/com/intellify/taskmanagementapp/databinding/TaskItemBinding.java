// Generated by data binding compiler. Do not edit!
package com.intellify.taskmanagementapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellify.taskmanagementapp.R;
import com.intellify.taskmanagementapp.data.local.entity.Task;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TaskItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clTask;

  @NonNull
  public final AppCompatTextView txtTaskSubTitle;

  @NonNull
  public final AppCompatTextView txtTaskTitle;

  @Bindable
  protected Task mTask;

  protected TaskItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clTask, AppCompatTextView txtTaskSubTitle, AppCompatTextView txtTaskTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clTask = clTask;
    this.txtTaskSubTitle = txtTaskSubTitle;
    this.txtTaskTitle = txtTaskTitle;
  }

  public abstract void setTask(@Nullable Task task);

  @Nullable
  public Task getTask() {
    return mTask;
  }

  @NonNull
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.task_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TaskItemBinding>inflateInternal(inflater, R.layout.task_item, root, attachToRoot, component);
  }

  @NonNull
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.task_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TaskItemBinding>inflateInternal(inflater, R.layout.task_item, null, false, component);
  }

  public static TaskItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static TaskItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (TaskItemBinding)bind(component, view, R.layout.task_item);
  }
}
