package com.gabriel.chuckio.categories.adapter

import android.view.View
import com.gabriel.chuckio.base.adapter.BaseHolder
import com.gabriel.chuckio.categories.CategoriesContracts
import com.gabriel.chuckio.di.AppComponent
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import kotlinx.android.synthetic.main.item_category.view.*
import javax.inject.Inject

class CategoriesHolder(itemView: View, val presenter: CategoriesContracts.Presenter) : BaseHolder<String>(itemView) {

    override fun bind(item: String) {
        itemView.button_category.text = item
        itemView.button_category.setOnClickListener {
            presenter.onCategorySelected(item)
        }
    }
}