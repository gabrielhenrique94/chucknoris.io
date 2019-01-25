package com.gabriel.chuckio.categories

import com.gabriel.chuckio.categories.CategoriesContracts.Presenter
import com.gabriel.chuckio.categories.CategoriesContracts.Repository
import dagger.Binds
import dagger.Module


@Module
abstract class CategoriesModule {
    @Binds
    abstract fun providesPresenter(presenter: CategoriesPresenter): Presenter

    @Binds
    abstract fun providesRepository(presenter: CategoriesRepository): Repository
}