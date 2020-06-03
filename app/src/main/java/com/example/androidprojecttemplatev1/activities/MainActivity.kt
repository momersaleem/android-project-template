package com.example.androidprojecttemplatev1.activities

import android.os.Bundle
import com.example.androidprojecttemplatev1.R
import com.example.androidprojecttemplatev1.fragments.MainFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(
            R.id.container_fragment,
            MainFragment(),
            false,
            MainFragment.TAG ?: ""
        )
    }
}
