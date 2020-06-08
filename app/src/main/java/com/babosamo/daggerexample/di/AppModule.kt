package com.babosamo.daggerexample.di

import com.babosamo.daggerexample.di.module.LoginActivityModule
import com.babosamo.daggerexample.di.scope.ActivityScope
import com.babosamo.daggerexample.ui.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    abstract fun loginActivity(): LoginActivity
}

