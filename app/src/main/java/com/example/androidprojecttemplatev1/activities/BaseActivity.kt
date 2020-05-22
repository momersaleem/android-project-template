package com.example.androidprojecttemplatev1.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidprojecttemplatev1.contractors.ActivityContractor
import com.example.androidprojecttemplatev1.contractors.ErrorContractor
import com.example.androidprojecttemplatev1.contractors.UIContractor
import com.example.androidprojecttemplatev1.utils.CommonUtil
import com.example.androidprojecttemplatev1.utils.FragmentUtil

abstract class BaseActivity : AppCompatActivity(),
    UIContractor,
    ErrorContractor,
    ActivityContractor {

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

    override fun somethingWentWrong(context: Context) {
        CommonUtil.somethingWentWrong(context)
    }

    override fun showLoaderView() {}

    override fun showErrorView() {}

    override fun showContentView() {}
}
