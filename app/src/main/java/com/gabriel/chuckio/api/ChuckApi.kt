package com.gabriel.chuckio.api

import com.gabriel.chuckio.data.joke.RandomJokeResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ChuckApi {
    @GET("/jokes/categories")
    fun listCategories(): Single<List<String>>

    @GET("/jokes/random")
    fun randomJoke(@Query("category") category: String): Single<RandomJokeResponse>
}