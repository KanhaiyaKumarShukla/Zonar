package com.example.reflekt

import android.app.Application
import com.google.android.libraries.places.api.Places
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        Places.initialize(applicationContext, "AIzaSyAG71oZoh5EI4bfro8Kct2wySMflLwOR6k")
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree()) // Logs only in Debug mode
        }
        app = this
    }


    companion object {

        @JvmStatic
        lateinit var app: MyApp

    }
}