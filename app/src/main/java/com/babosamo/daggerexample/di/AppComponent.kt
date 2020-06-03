package com.babosamo.daggerexample.di

import com.babosamo.daggerexample.App
import com.babosamo.daggerexample.di.component.LoginActivityComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {

    fun loginActivityComponentBuilder() : LoginActivityComponent.Builder

    fun inject(app: App)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: App, appModule: AppModule): AppComponent
    }
}