package com.gabriel.chuckio.joke

import com.gabriel.chuckio.base.mvp.BaseView
import com.gabriel.chuckio.data.joke.RandomJokeResponse
import com.gabriel.chuckio.joke.dataui.Joke
import io.reactivex.Single


object JokeContracts {
    interface View : BaseView<Presenter>

    interface Presenter {
        fun getRandomJoke(category: String): Single<Joke>
        var view: View?
    }

    interface Repository {
        fun getRandomJoke(category: String): Single<RandomJokeResponse>
    }
}