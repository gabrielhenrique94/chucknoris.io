package com.gabriel.chuckio.categories

import com.gabriel.chuckio.base.mvp.BaseView
import io.reactivex.Single

object CategoriesContracts {
    interface View : BaseView<Presenter> {
        fun showRandomJoke(category: String)
    }

    interface Presenter {
        fun onCategorySelected(category: String): Any
        fun listCategories(): Single<List<String>>
        var view: View?
    }

    interface Repository {
        fun listCategories(): Single<List<String>>
    }
}