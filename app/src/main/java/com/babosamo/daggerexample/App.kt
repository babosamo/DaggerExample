package com.babosamo.daggerexample

import android.app.Application
import com.babosamo.daggerexample.di.AppComponent
import com.babosamo.daggerexample.di.AppModule
import com.babosamo.daggerexample.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this, AppModule())
    }
}