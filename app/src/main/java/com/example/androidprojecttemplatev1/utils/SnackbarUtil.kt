package com.example.androidprojecttemplatev1.utils

import android.content.Context
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttemplatev1.R
import com.google.android.material.snackbar.Snackbar

object SnackbarUtil {
    fun somethingWentWrong(context: Context) {
        val parentLayout =
            (context as AppCompatActivity).findViewById<View>(android.R.id.content)

        Snackbar.make(
            parentLayout,
            context.getString(R.string.something_went_wrong),
            Snackbar.LENGTH_SHORT
        ).show()
    }
}