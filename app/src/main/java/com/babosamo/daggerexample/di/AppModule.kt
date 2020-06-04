package com.babosamo.daggerexample.di

import com.babosamo.daggerexample.di.component.LoginActivitySubComponent
import com.babosamo.daggerexample.ui.login.LoginActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [LoginActivitySubComponent::class])
abstract class AppModule {

    @Binds
    @IntoMap
    @ClassKey(LoginActivity::class)
    abstract fun bindAndroidInjectorFactory(factory: LoginActivitySubComponent.Factory): AndroidInjector.Factory<*>

}

