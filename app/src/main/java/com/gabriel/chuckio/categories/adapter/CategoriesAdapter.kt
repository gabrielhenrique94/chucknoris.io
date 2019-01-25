package com.gabriel.chuckio.categories.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.gabriel.chuckio.base.adapter.BaseAdapter
import com.gabriel.chuckio.base.adapter.BaseHolder
import com.gabriel.chuckio.R
import com.gabriel.chuckio.categories.CategoriesContracts.Presenter


class CategoriesAdapter(val presenter: Presenter) : BaseAdapter<String>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder<String> {
        val inflater = LayoutInflater.from(parent.context)
        return CategoriesHolder(inflater.inflate(R.layout.item_category, parent, false), presenter)
    }
}