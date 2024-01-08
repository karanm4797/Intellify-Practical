package com.intellify.taskmanagementapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.intellify.taskmanagementapp.databinding.ActivityTasksBindingImpl;
import com.intellify.taskmanagementapp.databinding.CustomToolbarBindingImpl;
import com.intellify.taskmanagementapp.databinding.DialogAddTaskBindingImpl;
import com.intellify.taskmanagementapp.databinding.TaskItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYTASKS = 1;

  private static final int LAYOUT_CUSTOMTOOLBAR = 2;

  private static final int LAYOUT_DIALOGADDTASK = 3;

  private static final int LAYOUT_TASKITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellify.taskmanagementapp.R.layout.activity_tasks, LAYOUT_ACTIVITYTASKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellify.taskmanagementapp.R.layout.custom_toolbar, LAYOUT_CUSTOMTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellify.taskmanagementapp.R.layout.dialog_add_task, LAYOUT_DIALOGADDTASK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.intellify.taskmanagementapp.R.layout.task_item, LAYOUT_TASKITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYTASKS: {
          if ("layout/activity_tasks_0".equals(tag)) {
            return new ActivityTasksBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_tasks is invalid. Received: " + tag);
        }
        case  LAYOUT_CUSTOMTOOLBAR: {
          if ("layout/custom_toolbar_0".equals(tag)) {
            return new CustomToolbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for custom_toolbar is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGADDTASK: {
          if ("layout/dialog_add_task_0".equals(tag)) {
            return new DialogAddTaskBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_add_task is invalid. Received: " + tag);
        }
        case  LAYOUT_TASKITEM: {
          if ("layout/task_item_0".equals(tag)) {
            return new TaskItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for task_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "click");
      sKeys.put(2, "task");
      sKeys.put(3, "title");
      sKeys.put(4, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_tasks_0", com.intellify.taskmanagementapp.R.layout.activity_tasks);
      sKeys.put("layout/custom_toolbar_0", com.intellify.taskmanagementapp.R.layout.custom_toolbar);
      sKeys.put("layout/dialog_add_task_0", com.intellify.taskmanagementapp.R.layout.dialog_add_task);
      sKeys.put("layout/task_item_0", com.intellify.taskmanagementapp.R.layout.task_item);
    }
  }
}
