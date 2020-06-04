package com.babosamo.daggerexample.di.module

import androidx.lifecycle.ViewModelProviders
import com.babosamo.daggerexample.di.scope.ActivityScope
import com.babosamo.daggerexample.ui.login.LoginActivity
import com.babosamo.daggerexample.ui.login.LoginViewModel
import com.babosamo.daggerexample.ui.login.LoginViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class LoginActivityModule {

    @Provides
    @ActivityScope
    fun provideActivityName(): String {
        return LoginActivity::class.java.simpleName
    }

    @Provides
    @ActivityScope
    fun provideLoginViewModel(loginActivity: LoginActivity): LoginViewModel {
        return ViewModelProviders.of(loginActivity, LoginViewModelFactory()).get(LoginViewModel::class.java)
    }

}