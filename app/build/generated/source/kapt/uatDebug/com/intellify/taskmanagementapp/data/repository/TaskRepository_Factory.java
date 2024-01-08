package com.intellify.taskmanagementapp.data.repository;

import android.content.Context;
import com.intellify.taskmanagementapp.data.local.dao.TaskDao;
import com.intellify.taskmanagementapp.data.remote.ApiServices;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class TaskRepository_Factory implements Factory<TaskRepository> {
  private final Provider<Context> contextProvider;

  private final Provider<ApiServices> apiServicesProvider;

  private final Provider<TaskDao> taskDaoProvider;

  public TaskRepository_Factory(Provider<Context> contextProvider,
      Provider<ApiServices> apiServicesProvider, Provider<TaskDao> taskDaoProvider) {
    this.contextProvider = contextProvider;
    this.apiServicesProvider = apiServicesProvider;
    this.taskDaoProvider = taskDaoProvider;
  }

  @Override
  public TaskRepository get() {
    return newInstance(contextProvider.get(), apiServicesProvider.get(), taskDaoProvider.get());
  }

  public static TaskRepository_Factory create(Provider<Context> contextProvider,
      Provider<ApiServices> apiServicesProvider, Provider<TaskDao> taskDaoProvider) {
    return new TaskRepository_Factory(contextProvider, apiServicesProvider, taskDaoProvider);
  }

  public static TaskRepository newInstance(Context context, ApiServices apiServices,
      TaskDao taskDao) {
    return new TaskRepository(context, apiServices, taskDao);
  }
}
