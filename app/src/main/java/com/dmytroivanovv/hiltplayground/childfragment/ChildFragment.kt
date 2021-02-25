package com.dmytroivanovv.hiltplayground.childfragment

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dmytroivanovv.hiltplayground.BaseFragment
import com.google.android.material.textview.MaterialTextView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChildFragment : BaseFragment<ChildFragmentViewModel, IChildFragmentViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return MaterialTextView(requireContext()).apply {
            id = View.generateViewId()
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            gravity = Gravity.CENTER
            text = arguments?.getString("text")
        }
    }

    override fun getViewModelClass(): Class<ChildFragmentViewModel> {
        return ChildFragmentViewModel::class.java
    }
}