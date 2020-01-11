package com.example.data.util

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import retrofit2.Response

open class RequestHandler {

    suspend fun <T> makeRequest(response: Response<T>): T? {
        return coroutineScope {
            withContext(Dispatchers.IO) {
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
}