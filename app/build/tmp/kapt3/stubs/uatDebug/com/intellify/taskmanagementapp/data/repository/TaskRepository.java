package com.intellify.taskmanagementapp.data.repository;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J-\u0010\u0011\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00140\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015JO\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\r0\u001a2\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u001e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/intellify/taskmanagementapp/data/repository/TaskRepository;", "", "context", "Landroid/content/Context;", "apiServices", "Lcom/intellify/taskmanagementapp/data/remote/ApiServices;", "taskDao", "Lcom/intellify/taskmanagementapp/data/local/dao/TaskDao;", "(Landroid/content/Context;Lcom/intellify/taskmanagementapp/data/remote/ApiServices;Lcom/intellify/taskmanagementapp/data/local/dao/TaskDao;)V", "getContext", "()Landroid/content/Context;", "addTasks", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellify/taskmanagementapp/data/remote/ApiCallback;", "Lcom/intellify/taskmanagementapp/data/model/TaskRes;", "task", "(Lcom/intellify/taskmanagementapp/data/model/TaskRes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasks", "Ljava/util/ArrayList;", "Lcom/intellify/taskmanagementapp/data/local/entity/Task;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseResponse", "", "T", "flowCollector", "Lkotlinx/coroutines/flow/FlowCollector;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTasks", "app_uatDebug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class TaskRepository {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.intellify.taskmanagementapp.data.remote.ApiServices apiServices = null;
    @org.jetbrains.annotations.NotNull
    private com.intellify.taskmanagementapp.data.local.dao.TaskDao taskDao;
    
    @javax.inject.Inject
    public TaskRepository(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.intellify.taskmanagementapp.data.remote.ApiServices apiServices, @org.jetbrains.annotations.NotNull
    com.intellify.taskmanagementapp.data.local.dao.TaskDao taskDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object parseResponse(kotlinx.coroutines.flow.FlowCollector<? super com.intellify.taskmanagementapp.data.remote.ApiCallback<T>> flowCollector, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> apiCall, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTasks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.intellify.taskmanagementapp.data.remote.ApiCallback<java.util.ArrayList<com.intellify.taskmanagementapp.data.local.entity.Task>>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addTasks(@org.jetbrains.annotations.NotNull
    com.intellify.taskmanagementapp.data.model.TaskRes task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.intellify.taskmanagementapp.data.remote.ApiCallback<com.intellify.taskmanagementapp.data.model.TaskRes>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateTasks(@org.jetbrains.annotations.NotNull
    com.intellify.taskmanagementapp.data.model.TaskRes task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.intellify.taskmanagementapp.data.remote.ApiCallback<com.intellify.taskmanagementapp.data.model.TaskRes>>> $completion) {
        return null;
    }
}