package com.dmytroivanovv.hiltplayground

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment<VM : ViewModel, VMProtocol : IViewModel> : Fragment() {

    lateinit var viewModel: VMProtocol

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(getViewModelClass()) as VMProtocol
    }

    abstract fun getViewModelClass(): Class<VM>
}