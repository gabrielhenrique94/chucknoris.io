package com.gabriel.chuckio.base.mvp

interface BaseView<T> {
    fun startLoading()
    fun stopLoading()
    var presenter: T
}
