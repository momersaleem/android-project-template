package com.example.androidprojecttemplatev1.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

object FragmentUtil {

    fun replaceFragment(
        activity: AppCompatActivity,
        container: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    ) {
        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(container, newFragment, TAG)
        if (addBackToStack)
            transaction.addToBackStack(TAG)
        transaction.commit()
    }

    fun replaceChildFragment(
        currentFragment: Fragment,
        container: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    ) {
        val transaction = currentFragment.childFragmentManager.beginTransaction()
        transaction.replace(container, newFragment)
        if (addBackToStack)
            transaction.addToBackStack(TAG)
        transaction.commit()
    }
}