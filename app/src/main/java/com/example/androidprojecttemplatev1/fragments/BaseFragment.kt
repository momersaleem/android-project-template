package com.example.androidprojecttemplatev1.fragments

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.androidprojecttemplatev1.contractors.ErrorContractor
import com.example.androidprojecttemplatev1.contractors.FragmentContractor
import com.example.androidprojecttemplatev1.contractors.UIContractor
import com.example.androidprojecttemplatev1.utils.SnackbarUtil
import com.example.androidprojecttemplatev1.utils.ToastUtil

abstract class BaseFragment : Fragment(),
    UIContractor,
    ErrorContractor,
    FragmentContractor {

    override fun Fragment.replaceChildFragment(
        fragmentContainer: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    ) {
        val transaction = childFragmentManager.beginTransaction()
        transaction.replace(fragmentContainer, newFragment, TAG)
        if (addBackToStack)
            transaction.addToBackStack(TAG)
        transaction.commit()
    }


    override fun Fragment.addChildFragment(
        fragmentContainer: Int,
        newFragment: Fragment,
        addBackToStack: Boolean,
        TAG: String
    ) {
        val transaction = childFragmentManager.beginTransaction()
        transaction.add(fragmentContainer, newFragment, TAG)
        if (addBackToStack)
            transaction.addToBackStack(TAG)
        transaction.commit()
    }

    override fun showLoaderView() {}

    override fun showErrorView() {}

    override fun showContentView() {}

    override fun somethingWentWrongSnackBar(context: Context) {
        SnackbarUtil.somethingWentWrong(context)
    }

    override fun somethingWentWrongToast(context: Context) {
        ToastUtil.somethingWentWrong(context)
    }
}