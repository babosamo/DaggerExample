package com.babosamo.daggerexample.di

import com.babosamo.daggerexample.di.component.LoginActivityComponent
import dagger.Module

@Module(subcomponents = [LoginActivityComponent::class])
public class AppModule {

}