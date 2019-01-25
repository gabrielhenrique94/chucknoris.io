package com.gabriel.chuckio.joke

import com.gabriel.chuckio.api.ChuckApi
import io.reactivex.Single
import javax.inject.Inject

class JokeRepository @Inject constructor(val api: ChuckApi) : JokeContracts.Repository{
    override fun getRandomJoke(category: String)=  api.randomJoke(category)
}