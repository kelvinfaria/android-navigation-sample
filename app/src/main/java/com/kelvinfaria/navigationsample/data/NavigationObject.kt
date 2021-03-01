package com.kelvinfaria.navigationsample.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NavigationObject(
    var navigationOrigin: String,
    var navigationType: String
) : Parcelable {

    companion object {
        val EMPTY = NavigationObject(
            navigationOrigin = "",
            navigationType = ""
        )
    }
}