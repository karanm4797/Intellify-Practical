package com.intellify.taskmanagementapp.ui.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0006\u0010\u001e\u001a\u00020\u0015J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\bR\u001c\u0010\u0001\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00018\u0001X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/intellify/taskmanagementapp/ui/activity/BaseAct;", "binding", "Landroidx/databinding/ViewDataBinding;", "VM", "Lcom/intellify/taskmanagementapp/ui/viewmodel/BaseVM;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "layoutId", "", "(I)V", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "progress", "Lcom/intellify/taskmanagementapp/utils/Progress;", "vm", "getVm", "()Lcom/intellify/taskmanagementapp/ui/viewmodel/BaseVM;", "hideProgress", "", "init", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setProgressbar", "showProgress", "showSnackBar", "message", "", "color", "app_uatDebug"})
public abstract class BaseAct<binding extends androidx.databinding.ViewDataBinding, VM extends com.intellify.taskmanagementapp.ui.viewmodel.BaseVM> extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private final int layoutId = 0;
    protected binding binding;
    private com.intellify.taskmanagementapp.utils.Progress progress;
    
    public BaseAct(@androidx.annotation.LayoutRes
    int layoutId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final binding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull
    binding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    protected abstract VM getVm();
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void init();
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View v) {
    }
    
    private final void setProgressbar() {
    }
    
    public final void showProgress() {
    }
    
    public final void hideProgress() {
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.NotNull
    java.lang.String message, int color) {
    }
}