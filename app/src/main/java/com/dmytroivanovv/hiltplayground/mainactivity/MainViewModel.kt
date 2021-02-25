package com.dmytroivanovv.hiltplayground.mainactivity

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.dmytroivanovv.hiltplayground.IViewModel
import com.dmytroivanovv.hiltplayground.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

interface IMainViewModel : IViewModel

@HiltViewModel
class MainViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: Repository,
    @Named("str") private val str: String
): ViewModel(), IMainViewModel {

    init {
        println("1")
    }

    override fun onCleared() {
        super.onCleared()
    }
}