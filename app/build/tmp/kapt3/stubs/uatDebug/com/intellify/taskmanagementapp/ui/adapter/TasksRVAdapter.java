package com.intellify.taskmanagementapp.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B1\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\tH\u0016J\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u001e\u0010\u0015\u001a\u00020\n2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/intellify/taskmanagementapp/ui/adapter/TasksRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/intellify/taskmanagementapp/ui/adapter/TasksRVAdapter$TasksViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/intellify/taskmanagementapp/data/local/entity/Task;", "Lkotlin/collections/ArrayList;", "onItemClicked", "Lkotlin/Function1;", "", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "getList", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTaskList", "taskList", "TasksViewHolder", "app_uatDebug"})
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
public final class TasksRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.intellify.taskmanagementapp.ui.adapter.TasksRVAdapter.TasksViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.intellify.taskmanagementapp.data.local.entity.Task> list;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onItemClicked = null;
    
    public TasksRVAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.intellify.taskmanagementapp.data.local.entity.Task> list, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClicked) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.intellify.taskmanagementapp.ui.adapter.TasksRVAdapter.TasksViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.intellify.taskmanagementapp.ui.adapter.TasksRVAdapter.TasksViewHolder holder, int position) {
    }
    
    public final void setTaskList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.intellify.taskmanagementapp.data.local.entity.Task> taskList) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.intellify.taskmanagementapp.data.local.entity.Task> getList() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/intellify/taskmanagementapp/ui/adapter/TasksRVAdapter$TasksViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/intellify/taskmanagementapp/databinding/TaskItemBinding;", "(Lcom/intellify/taskmanagementapp/databinding/TaskItemBinding;)V", "getBinding$app_uatDebug", "()Lcom/intellify/taskmanagementapp/databinding/TaskItemBinding;", "app_uatDebug"})
    public static final class TasksViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.intellify.taskmanagementapp.databinding.TaskItemBinding binding = null;
        
        public TasksViewHolder(@org.jetbrains.annotations.NotNull
        com.intellify.taskmanagementapp.databinding.TaskItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.intellify.taskmanagementapp.databinding.TaskItemBinding getBinding$app_uatDebug() {
            return null;
        }
    }
}