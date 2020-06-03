package com.example.androidprojecttemplatev1.contractors

import androidx.fragment.app.Fragment

interface FragmentContractor : NavigationContractor {
    fun Fragment.replaceChildFragment(
        fragmentContainer: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    )

    fun Fragment.addChildFragment(
        fragmentContainer: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    )
}