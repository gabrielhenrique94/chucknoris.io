package com.gabriel.chuckio.joke

import com.gabriel.chuckio.joke.JokeContracts.Presenter
import com.gabriel.chuckio.joke.JokeContracts.Repository
import dagger.Binds
import dagger.Module

@Module
abstract class JokeModule {
    @Binds
    abstract fun providesPresenter(presenter: JokePresenter): Presenter

    @Binds
    abstract fun providesRepository(presenter: JokeRepository): Repository


}