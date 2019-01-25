package com.gabriel.chuckio.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.gabriel.chuckio.base.mvp.BaseView
import dagger.android.AndroidInjection
import io.reactivex.disposables.CompositeDisposable

abstract class BaseActivity<T> : AppCompatActivity(), BaseView<T> {
    var compositeDisposable = CompositeDisposable()


    override fun onResume() {
        super.onResume()
        compositeDisposable = CompositeDisposable()
    }

    override fun onPause() {
        super.onPause()
        compositeDisposable.clear()
    }
}