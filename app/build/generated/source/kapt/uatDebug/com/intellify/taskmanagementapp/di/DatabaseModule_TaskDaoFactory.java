package com.intellify.taskmanagementapp.di;

import android.content.Context;
import com.intellify.taskmanagementapp.data.local.dao.TaskDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_TaskDaoFactory implements Factory<TaskDao> {
  private final DatabaseModule module;

  private final Provider<Context> appContextProvider;

  public DatabaseModule_TaskDaoFactory(DatabaseModule module,
      Provider<Context> appContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public TaskDao get() {
    return taskDao(module, appContextProvider.get());
  }

  public static DatabaseModule_TaskDaoFactory create(DatabaseModule module,
      Provider<Context> appContextProvider) {
    return new DatabaseModule_TaskDaoFactory(module, appContextProvider);
  }

  public static TaskDao taskDao(DatabaseModule instance, Context appContext) {
    return Preconditions.checkNotNullFromProvides(instance.taskDao(appContext));
  }
}
