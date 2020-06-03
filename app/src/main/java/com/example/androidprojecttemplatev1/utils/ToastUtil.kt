package com.example.androidprojecttemplatev1.utils

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidprojecttemplatev1.R
import com.google.android.material.snackbar.Snackbar

object ToastUtil {
    fun somethingWentWrong(context: Context) {
        Toast.makeText(
            context,
            context.getString(R.string.something_went_wrong),
            Toast.LENGTH_SHORT
        ).show()
    }
}