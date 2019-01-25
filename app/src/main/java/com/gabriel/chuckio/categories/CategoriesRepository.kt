package com.gabriel.chuckio.categories

import com.gabriel.chuckio.api.ChuckApi
import com.gabriel.chuckio.categories.CategoriesContracts.Repository
import javax.inject.Inject


class CategoriesRepository @Inject constructor(val api: ChuckApi) : Repository {
    override fun listCategories() = api.listCategories()
}
