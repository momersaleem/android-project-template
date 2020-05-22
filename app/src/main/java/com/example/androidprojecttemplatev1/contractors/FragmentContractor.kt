package com.example.androidprojecttemplatev1.contractors

import androidx.fragment.app.Fragment

interface FragmentContractor :
    NavigationContractor {

    fun replaceChildFragment(
        currentFragment: Fragment,
        container: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    )
}