package com.example.androidprojecttemplatev1.fragments

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidprojecttemplatev1.contractors.ErrorContractor
import com.example.androidprojecttemplatev1.contractors.FragmentContractor
import com.example.androidprojecttemplatev1.contractors.UIContractor
import com.example.androidprojecttemplatev1.utils.CommonUtil
import com.example.androidprojecttemplatev1.utils.FragmentUtil

abstract class BaseFragment : Fragment(),
    UIContractor,
    ErrorContractor,
    FragmentContractor {

    override fun somethingWentWrong(context: Context) {
        CommonUtil.somethingWentWrong(context)
    }

    override fun replaceFragment(
        activity: AppCompatActivity,
        container: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    ) {
        FragmentUtil.replaceFragment(
            activity,
            container,
            newFragment,
            addBackToStack,
            TAG
        )
    }

    override fun replaceChildFragment(
        currentFragment: Fragment,
        container: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    ) {
        FragmentUtil.replaceChildFragment(
            currentFragment,
            container,
            newFragment,
            addBackToStack,
            TAG
        )
    }
}