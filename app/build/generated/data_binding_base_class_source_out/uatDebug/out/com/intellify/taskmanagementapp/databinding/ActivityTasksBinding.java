// Generated by data binding compiler. Do not edit!
package com.intellify.taskmanagementapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.intellify.taskmanagementapp.R;
import com.intellify.taskmanagementapp.ui.viewmodel.TasksVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTasksBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton fabAddTask;

  @NonNull
  public final RecyclerView rvTasks;

  @NonNull
  public final CustomToolbarBinding toolbar;

  @NonNull
  public final AppCompatTextView txtNoTasks;

  @Bindable
  protected TasksVM mVm;

  @Bindable
  protected View.OnClickListener mClick;

  protected ActivityTasksBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton fabAddTask, RecyclerView rvTasks, CustomToolbarBinding toolbar,
      AppCompatTextView txtNoTasks) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fabAddTask = fabAddTask;
    this.rvTasks = rvTasks;
    this.toolbar = toolbar;
    this.txtNoTasks = txtNoTasks;
  }

  public abstract void setVm(@Nullable TasksVM vm);

  @Nullable
  public TasksVM getVm() {
    return mVm;
  }

  public abstract void setClick(@Nullable View.OnClickListener click);

  @Nullable
  public View.OnClickListener getClick() {
    return mClick;
  }

  @NonNull
  public static ActivityTasksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_tasks, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTasksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTasksBinding>inflateInternal(inflater, R.layout.activity_tasks, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTasksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_tasks, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTasksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTasksBinding>inflateInternal(inflater, R.layout.activity_tasks, null, false, component);
  }

  public static ActivityTasksBinding bind(@NonNull View view) {
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
  public static ActivityTasksBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTasksBinding)bind(component, view, R.layout.activity_tasks);
  }
}
