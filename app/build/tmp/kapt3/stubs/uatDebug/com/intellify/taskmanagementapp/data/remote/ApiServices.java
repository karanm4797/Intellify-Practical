package com.intellify.taskmanagementapp.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/intellify/taskmanagementapp/data/remote/ApiServices;", "", "addTasks", "Lretrofit2/Response;", "Lcom/intellify/taskmanagementapp/data/model/TaskRes;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasks", "Ljava/util/ArrayList;", "Lcom/intellify/taskmanagementapp/data/local/entity/Task;", "Lkotlin/collections/ArrayList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTasks", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_uatDebug"})
public abstract interface ApiServices {
    
    @retrofit2.http.GET(value = "api/glitch-tasks")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTasks(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.ArrayList<com.intellify.taskmanagementapp.data.local.entity.Task>>> $completion);
    
    @retrofit2.http.POST(value = "api/add-task")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addTasks(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    okhttp3.RequestBody body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellify.taskmanagementapp.data.model.TaskRes>> $completion);
    
    @retrofit2.http.POST(value = "api/add-task")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateTasks(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellify.taskmanagementapp.data.model.TaskRes>> $completion);
}