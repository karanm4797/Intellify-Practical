package com.intellify.taskmanagementapp.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

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
public final class RetrofitService_ProvideHTTPClientFactory implements Factory<OkHttpClient> {
  private final RetrofitService module;

  public RetrofitService_ProvideHTTPClientFactory(RetrofitService module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideHTTPClient(module);
  }

  public static RetrofitService_ProvideHTTPClientFactory create(RetrofitService module) {
    return new RetrofitService_ProvideHTTPClientFactory(module);
  }

  public static OkHttpClient provideHTTPClient(RetrofitService instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideHTTPClient());
  }
}
