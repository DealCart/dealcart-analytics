package io.dealcart.analytics

import android.util.Log

 class ShapeAnalytics {
    companion object {
        fun initApp(key: String) {
            Log.e("Initialised", "with: " + key)
        }
    }
}