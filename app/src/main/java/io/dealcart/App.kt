package io.dealcart

import android.app.Application
import io.dealcart.analytics.ShapeAnalytics

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        ShapeAnalytics.initApp("Saad")
    }
}