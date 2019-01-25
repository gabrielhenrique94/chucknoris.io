package com.gabriel.chuckio.di

import com.gabriel.chuckio.App
import com.gabriel.chuckio.api.ApiModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBindingModule::class,
    ApiModule::class])
interface AppComponent : AndroidInjector<App>