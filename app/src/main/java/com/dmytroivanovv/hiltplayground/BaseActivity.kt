package com.dmytroivanovv.hiltplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<VM : ViewModel, VMProtocol : IViewModel> : AppCompatActivity() {

    lateinit var viewModel: VMProtocol

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(getViewModelClass()) as VMProtocol
    }

    abstract fun getViewModelClass(): Class<VM>
}