package com.example.util.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    fun scopeViewModel(block: suspend () -> Unit): Job {
        return viewModelScope.launch {
            block()
        }
    }
}