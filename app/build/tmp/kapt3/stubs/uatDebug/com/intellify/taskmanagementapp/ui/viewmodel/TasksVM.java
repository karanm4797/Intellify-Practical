package com.intellify.taskmanagementapp.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\u000e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000fj\b\u0012\u0004\u0012\u00020\f`\u00100\u00070\u0006J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/intellify/taskmanagementapp/ui/viewmodel/TasksVM;", "Lcom/intellify/taskmanagementapp/ui/viewmodel/BaseVM;", "taskRepository", "Lcom/intellify/taskmanagementapp/data/repository/TaskRepository;", "(Lcom/intellify/taskmanagementapp/data/repository/TaskRepository;)V", "addOrUpdateTask", "Landroidx/lifecycle/LiveData;", "Lcom/intellify/taskmanagementapp/data/remote/ApiCallback;", "Lcom/intellify/taskmanagementapp/data/model/TaskRes;", "isUpdate", "", "task", "Lcom/intellify/taskmanagementapp/data/local/entity/Task;", "addTask", "getTasks", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "updateTask", "app_uatDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class TasksVM extends com.intellify.taskmanagementapp.ui.viewmodel.BaseVM {
    @org.jetbrains.annotations.NotNull
    private com.intellify.taskmanagementapp.data.repository.TaskRepository taskRepository;
    
    @javax.inject.Inject
    public TasksVM(@org.jetbrains.annotations.NotNull
    com.intellify.taskmanagementapp.data.repository.TaskRepository taskRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intellify.taskmanagementapp.data.remote.ApiCallback<java.util.ArrayList<com.intellify.taskmanagementapp.data.local.entity.Task>>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.intellify.taskmanagementapp.data.remote.ApiCallback<com.intellify.taskmanagementapp.data.model.TaskRes>> addOrUpdateTask(boolean isUpdate, @org.jetbrains.annotations.NotNull
    com.intellify.taskmanagementapp.data.local.entity.Task task) {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<com.intellify.taskmanagementapp.data.remote.ApiCallback<com.intellify.taskmanagementapp.data.model.TaskRes>> addTask(com.intellify.taskmanagementapp.data.local.entity.Task task) {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<com.intellify.taskmanagementapp.data.remote.ApiCallback<com.intellify.taskmanagementapp.data.model.TaskRes>> updateTask(com.intellify.taskmanagementapp.data.local.entity.Task task) {
        return null;
    }
}