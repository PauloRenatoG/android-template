package com.example.data.client

import com.example.data.util.RequestHandle
import javax.inject.Inject

class ApiClient @Inject constructor(
    private val apiService: ApiService
): RequestHandle() {

    suspend fun getList(): String? {
        return makeRequest(apiService.getList())
    }
}