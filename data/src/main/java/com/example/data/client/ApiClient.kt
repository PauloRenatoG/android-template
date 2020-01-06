package com.example.data.client

import com.example.data.util.RequestHandler
import javax.inject.Inject

class ApiClient @Inject constructor(
    private val apiService: ApiService
) : RequestHandler() {

    suspend fun getList(): String? {
        return makeRequest(apiService.getList())
    }
}