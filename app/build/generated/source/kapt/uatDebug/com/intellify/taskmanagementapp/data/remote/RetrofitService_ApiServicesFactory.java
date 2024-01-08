package com.intellify.taskmanagementapp.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class RetrofitService_ApiServicesFactory implements Factory<ApiServices> {
  private final RetrofitService module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public RetrofitService_ApiServicesFactory(RetrofitService module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public ApiServices get() {
    return apiServices(module, okHttpClientProvider.get());
  }

  public static RetrofitService_ApiServicesFactory create(RetrofitService module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new RetrofitService_ApiServicesFactory(module, okHttpClientProvider);
  }

  public static ApiServices apiServices(RetrofitService instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.apiServices(okHttpClient));
  }
}
