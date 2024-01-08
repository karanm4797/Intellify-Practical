package com.intellify.taskmanagementapp.ui.viewmodel;

import com.intellify.taskmanagementapp.data.repository.TaskRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
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
public final class TasksVM_Factory implements Factory<TasksVM> {
  private final Provider<TaskRepository> taskRepositoryProvider;

  public TasksVM_Factory(Provider<TaskRepository> taskRepositoryProvider) {
    this.taskRepositoryProvider = taskRepositoryProvider;
  }

  @Override
  public TasksVM get() {
    return newInstance(taskRepositoryProvider.get());
  }

  public static TasksVM_Factory create(Provider<TaskRepository> taskRepositoryProvider) {
    return new TasksVM_Factory(taskRepositoryProvider);
  }

  public static TasksVM newInstance(TaskRepository taskRepository) {
    return new TasksVM(taskRepository);
  }
}
