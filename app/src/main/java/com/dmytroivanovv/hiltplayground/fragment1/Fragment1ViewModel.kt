package com.dmytroivanovv.hiltplayground.fragment1

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.dmytroivanovv.hiltplayground.IViewModel
import com.dmytroivanovv.hiltplayground.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

interface IFragment1ViewModel : IViewModel

@HiltViewModel
class Fragment1ViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: Repository
) : ViewModel(), IFragment1ViewModel {

    init {
        println("1")
    }

    override fun onCleared() {
        super.onCleared()
    }
}