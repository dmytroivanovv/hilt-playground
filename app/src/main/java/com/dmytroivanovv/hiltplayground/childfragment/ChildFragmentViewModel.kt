package com.dmytroivanovv.hiltplayground.childfragment

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.dmytroivanovv.hiltplayground.IViewModel
import com.dmytroivanovv.hiltplayground.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

interface IChildFragmentViewModel : IViewModel

@HiltViewModel
class ChildFragmentViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: Repository
) : ViewModel(), IChildFragmentViewModel {

    init {
        println("1")
    }

    override fun onCleared() {
        super.onCleared()
    }
}