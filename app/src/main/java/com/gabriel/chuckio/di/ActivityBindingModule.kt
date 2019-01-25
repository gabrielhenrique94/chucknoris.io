package com.gabriel.chuckio.di

import com.gabriel.chuckio.categories.CategoriesActivity
import com.gabriel.chuckio.categories.CategoriesModule
import com.gabriel.chuckio.joke.JokeActivity
import com.gabriel.chuckio.joke.JokeModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivityBindingModule {

    @ContributesAndroidInjector(modules = [CategoriesModule::class])
    fun injectCategoriesActivity(): CategoriesActivity

    @ContributesAndroidInjector(modules = [JokeModule::class])
    fun injectJokeActivity(): JokeActivity
}