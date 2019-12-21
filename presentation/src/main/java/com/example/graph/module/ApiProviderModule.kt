package com.example.graph.module

import com.example.data.BuildConfig
import com.example.data.client.ApiClient
import com.example.data.client.ApiService
import com.example.util.API_ENDPOINT
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
object ApiProviderModule {

    @Singleton
    @Provides
    @Named(API_ENDPOINT)
    fun providesApiEndPoint(): String {
        return BuildConfig.API_ENDPOINT
    }

    @Singleton
    @Provides
    fun providesRetrofit(
        @Named(API_ENDPOINT) apiEndPoint: String
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(apiEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Singleton
    @Provides
    fun providesApiClient(apiService: ApiService): ApiClient {
        return ApiClient(apiService)
    }
}