package com.leo.app

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class TlinTimesApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}