package com.example.androidprojecttemplatev1.contractors

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

interface ActivityContractor : NavigationContractor {

    fun AppCompatActivity.replaceFragment(
        fragmentContainer: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    )

    fun AppCompatActivity.addFragment(
        fragmentContainer: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    )
}