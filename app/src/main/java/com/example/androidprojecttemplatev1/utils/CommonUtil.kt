package com.example.androidprojecttemplatev1.utils

import android.content.Context
import android.widget.Toast
import com.example.androidprojecttemplatev1.R

object CommonUtil {

    fun somethingWentWrong(context: Context) {
        Toast.makeText(
            context,
            context.getString(R.string.something_went_wrong),
            Toast.LENGTH_SHORT
        ).show()
    }
}