package com.example.data.client

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/")
    suspend fun getList(): Response<String?>
}