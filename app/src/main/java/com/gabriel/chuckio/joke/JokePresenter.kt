package com.gabriel.chuckio.joke

import com.gabriel.chuckio.joke.JokeContracts.Presenter
import com.gabriel.chuckio.joke.JokeContracts.View
import com.gabriel.chuckio.joke.dataui.Joke
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class JokePresenter @Inject constructor(val repository: JokeContracts.Repository) : Presenter {

    override fun getRandomJoke(category: String): Single<Joke> {
        return repository
                .getRandomJoke(category)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { view?.startLoading() }
                .doFinally { view?.stopLoading() }
                .map { response ->
                    Joke().apply {
                        this.content = response.value ?: ""
                        this.imgUrl = response.iconUrl ?: ""
                        this.link = response.url ?: ""
                    }
                }
    }

    override var view: View? = null


}