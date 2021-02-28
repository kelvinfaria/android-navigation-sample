package com.kelvinfaria.navigationsample.intent_navigation.utils

import android.app.Activity
import android.content.Intent

const val ORIGIN = "com.kelvinfaria.navigationsample.intent_navigation.utils.ORIGIN"

inline fun <reified T> Activity.startSingleTopActivity(passingParameter: Any?) {
    val intent = Intent(this, T::class.java).apply {
        flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        passingParameter?.let { putExtraOfAnyType(intent = this, passingParameter = it) }
    }

    startActivity(intent)
}

fun putExtraOfAnyType(intent: Intent, passingParameter: Any) {
    when (passingParameter) {
        is String -> intent.putExtra(ORIGIN, passingParameter)
    }
}