package com.example.data.util

import kotlinx.coroutines.coroutineScope
import retrofit2.Response

open class RequestHandle {

    suspend fun <T> makeRequest(response: Response<T>): T? {
        return coroutineScope {
            response.run {
                if (isSuccessful) {
                    body()
                } else {
                    throw Throwable()
                }
            }
        }
    }
}