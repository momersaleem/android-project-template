package com.example.androidprojecttemplatev1.contractors

import android.content.Context

interface ErrorContractor {
    fun somethingWentWrongSnackBar(context: Context)

    fun somethingWentWrongToast(context: Context)
}