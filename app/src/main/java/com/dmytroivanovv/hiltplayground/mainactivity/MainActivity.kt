package com.dmytroivanovv.hiltplayground.mainactivity

import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.dmytroivanovv.hiltplayground.BaseActivity
import com.dmytroivanovv.hiltplayground.R
import com.dmytroivanovv.hiltplayground.Repository
import com.dmytroivanovv.hiltplayground.fragment1.Fragment1
import com.google.android.material.button.MaterialButton
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<MainViewModel, IMainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val openFragmentBtn: MaterialButton = findViewById(R.id.open_fragment)
        val fragmentContainer: FragmentContainerView = findViewById(R.id.fragment_container)
        openFragmentBtn.setOnClickListener {
            val text = UUID.randomUUID().toString()
            supportFragmentManager
                .beginTransaction()
                .replace(fragmentContainer.id, Fragment1().apply {
                    arguments = Bundle().apply {
                        putString("text", text)
                    }
                })
                .addToBackStack(text)
                .commit()
        }
    }

    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }
}

