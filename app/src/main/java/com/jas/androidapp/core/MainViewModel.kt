package com.jas.androidapp.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    private val _splashLoading = MutableStateFlow(true )
    val splashLoading = _splashLoading.asStateFlow()
    init {
        viewModelScope.launch {
            delay(3000L)
            _splashLoading.value = false
        }
    }
}