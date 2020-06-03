package com.example.androidprojecttemplatev1.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidprojecttemplatev1.contractors.ActivityContractor
import com.example.androidprojecttemplatev1.contractors.ErrorContractor
import com.example.androidprojecttemplatev1.contractors.UIContractor
import com.example.androidprojecttemplatev1.utils.SnackbarUtil
import com.example.androidprojecttemplatev1.utils.ToastUtil

abstract class BaseActivity : AppCompatActivity(),
    UIContractor,
    ErrorContractor,
    ActivityContractor {

    override fun AppCompatActivity.replaceFragment(
        fragmentContainer: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    ) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(fragmentContainer, newFragment, TAG)
        if (addBackToStack)
            transaction.addToBackStack(TAG)
        transaction.commit()
    }

    override fun AppCompatActivity.addFragment(
        fragmentContainer: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    ) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(fragmentContainer, newFragment, TAG)
        if (addBackToStack)
            transaction.addToBackStack(TAG)
        transaction.commit()
    }

    override fun showLoaderView() {}

    override fun showErrorView() {}

    override fun showContentView() {}

    override fun somethingWentWrongSnackBar(context: Context) {
        SnackbarUtil.somethingWentWrong(this)
    }

    override fun somethingWentWrongToast(context: Context) {
        ToastUtil.somethingWentWrong(context)
    }
}
