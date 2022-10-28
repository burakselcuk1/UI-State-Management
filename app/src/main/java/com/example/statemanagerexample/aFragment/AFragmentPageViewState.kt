package com.example.statemanagerexample.aFragment

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.example.statemanagerexample.R
import com.example.statemanagerexample.Util.AuthGender

data class AFragmentPageViewState(
    val authGender: AuthGender = AuthGender.UNKNOWN
) {

    fun getGenderWomanBackgroundColor(context: Context): Int {
        return if (authGender == AuthGender.WOMAN)
            ContextCompat.getColor(context, R.color.register_gender_selected_color_women)
        else
            ContextCompat.getColor(context, R.color.register_gender_unselected_color)
    }

    fun getGenderWomanTextColor(context: Context): Int {
        return if (authGender == AuthGender.WOMAN)
            ContextCompat.getColor(context, R.color.white)
        else
            ContextCompat.getColor(context, R.color.register_title_color)
    }

    fun getGenderWomanIcon(context: Context): Drawable? {
        return if (authGender == AuthGender.WOMAN)
            ContextCompat.getDrawable(context, R.drawable.ic_woman_white)
        else
            ContextCompat.getDrawable(context, R.drawable.ic_woman)
    }

    fun getGenderManBackgroundColor(context: Context): Int {
        return if (authGender == AuthGender.MAN)
            ContextCompat.getColor(context, R.color.register_gender_selected_color)
        else
            ContextCompat.getColor(context, R.color.register_gender_unselected_color)
    }

    fun getGenderManTextColor(context: Context): Int {
        return if (authGender == AuthGender.MAN)
            ContextCompat.getColor(context, R.color.white)
        else
            ContextCompat.getColor(context, R.color.register_title_color)
    }

    fun getGenderManIcon(context: Context): Drawable? {
        return if (authGender == AuthGender.MAN)
            ContextCompat.getDrawable(context, R.drawable.ic_man_white)
        else
            ContextCompat.getDrawable(context, R.drawable.ic_man)
    }
}