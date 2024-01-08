package com.intellify.taskmanagementapp.ui.activity;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/intellify/taskmanagementapp/ui/activity/TasksAct;", "Lcom/intellify/taskmanagementapp/ui/activity/BaseAct;", "Lcom/intellify/taskmanagementapp/databinding/ActivityTasksBinding;", "Lcom/intellify/taskmanagementapp/ui/viewmodel/TasksVM;", "()V", "adapter", "Lcom/intellify/taskmanagementapp/ui/adapter/TasksRVAdapter;", "vm", "getVm", "()Lcom/intellify/taskmanagementapp/ui/viewmodel/TasksVM;", "vm$delegate", "Lkotlin/Lazy;", "addOrUpdateTask", "", "isUpdate", "", "task", "Lcom/intellify/taskmanagementapp/data/local/entity/Task;", "init", "showAddOrUpdateTaskDialog", "position", "", "showHideRecyclerView", "size", "app_uatDebug"})
public final class TasksAct extends com.intellify.taskmanagementapp.ui.activity.BaseAct<com.intellify.taskmanagementapp.databinding.ActivityTasksBinding, com.intellify.taskmanagementapp.ui.viewmodel.TasksVM> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy vm$delegate = null;
    private com.intellify.taskmanagementapp.ui.adapter.TasksRVAdapter adapter;
    
    public TasksAct() {
        super(0);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected com.intellify.taskmanagementapp.ui.viewmodel.TasksVM getVm() {
        return null;
    }
    
    @java.lang.Override
    public void init() {
    }
    
    private final void showHideRecyclerView(int size) {
    }
    
    private final void showAddOrUpdateTaskDialog(int position) {
    }
    
    private final void addOrUpdateTask(boolean isUpdate, com.intellify.taskmanagementapp.data.local.entity.Task task) {
    }
}