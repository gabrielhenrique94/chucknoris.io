package com.gabriel.chuckio.categories

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import com.gabriel.chuckio.R
import com.gabriel.chuckio.base.BaseActivity
import com.gabriel.chuckio.categories.adapter.CategoriesAdapter
import com.gabriel.chuckio.extensions.hide
import com.gabriel.chuckio.extensions.show
import com.gabriel.chuckio.joke.JokeActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_categories.*
import javax.inject.Inject

class CategoriesActivity : BaseActivity<CategoriesContracts.Presenter>(), CategoriesContracts.View {

    @Inject
    override lateinit var presenter: CategoriesContracts.Presenter

    private lateinit var adapter: CategoriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_categories)
        presenter.view = this
        initUI()
        compositeDisposable.add(
                presenter.listCategories().subscribe(this::showCategories, this::showErrorMessage))
    }

    private fun showCategories(categories: List<String>) {
        adapter.clear()
        adapter.add(categories)
    }

    private fun initUI() {
        adapter = CategoriesAdapter(presenter)
        recycler_categories_list.layoutManager = LinearLayoutManager(this)
        recycler_categories_list.adapter = adapter
    }

    override fun showRandomJoke(category: String) {
        startActivity(JokeActivity.getIntent(this, category))
    }

    fun showErrorMessage(throwable: Throwable) {
        Toast.makeText(this, R.string.error_categories, LENGTH_LONG).show()
    }

    override fun startLoading() {
        progress_categories.show()
        recycler_categories_list.hide()
    }

    override fun stopLoading() {
        progress_categories.hide()
        recycler_categories_list.show()
    }
}
