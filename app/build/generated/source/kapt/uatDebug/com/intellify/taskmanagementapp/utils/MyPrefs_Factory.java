package com.intellify.taskmanagementapp.utils;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class MyPrefs_Factory implements Factory<MyPrefs> {
  private final Provider<Context> contextProvider;

  public MyPrefs_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MyPrefs get() {
    return newInstance(contextProvider.get());
  }

  public static MyPrefs_Factory create(Provider<Context> contextProvider) {
    return new MyPrefs_Factory(contextProvider);
  }

  public static MyPrefs newInstance(Context context) {
    return new MyPrefs(context);
  }
}
