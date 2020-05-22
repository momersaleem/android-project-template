package com.example.androidprojecttemplatev1.contractors

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidprojecttemplatev1.R

interface NavigationContractor {

    fun replaceFragment(
        activity: AppCompatActivity,
        container: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    )
}