package com.kelvinfaria.navigationsample.intent_navigation.utils

import android.app.Activity
import android.content.Intent
import com.kelvinfaria.navigationsample.data.NavigationObject

const val ORIGIN = "com.kelvinfaria.navigationsample.intent_navigation.utils.ORIGIN"

inline fun <reified T> Activity.startSingleTopActivity(passingParameter: Any? = null) {
    val intent = Intent(this, T::class.java).apply {
        flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        passingParameter?.let { putExtraOfAnyType(intent = this, passingParameter = it) }
    }

    startActivity(intent)
}

fun putExtraOfAnyType(intent: Intent, passingParameter: Any) {
    when (passingParameter) {
        is String -> intent.putExtra(ORIGIN, passingParameter)
        is NavigationObject -> intent.putExtra(ORIGIN, passingParameter)
    }
}