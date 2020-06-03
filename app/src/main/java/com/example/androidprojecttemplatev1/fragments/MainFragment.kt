package com.example.androidprojecttemplatev1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidprojecttemplatev1.R

class MainFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        somethingWentWrong(view.context)
        somethingWentWrong(view.context, "")
    }

    companion object {
        val TAG = MainFragment::class.java.simpleName
    }
}