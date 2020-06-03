package com.babosamo.daggerexample.di.component

import com.babosamo.daggerexample.di.module.LoginActivityModule
import com.babosamo.daggerexample.di.scope.ActivityScope
import com.babosamo.daggerexample.ui.login.LoginActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [LoginActivityModule::class])
@ActivityScope
interface LoginActivityComponent {

    fun inject(loginActivity: LoginActivity)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(module: LoginActivityModule) : Builder

        @BindsInstance
        fun setActivity(activity: LoginActivity): Builder
        fun build(): LoginActivityComponent
    }
}