package com.babosamo.daggerexample.di.component

import com.babosamo.daggerexample.di.module.LoginActivityModule
import com.babosamo.daggerexample.di.scope.ActivityScope
import com.babosamo.daggerexample.ui.login.LoginActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActivityScope
@Subcomponent(modules = [LoginActivityModule::class])
interface LoginActivitySubComponent : AndroidInjector<LoginActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<LoginActivity>

}