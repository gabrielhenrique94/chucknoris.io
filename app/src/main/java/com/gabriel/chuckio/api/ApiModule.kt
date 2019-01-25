package com.gabriel.chuckio.api

import com.gabriel.chuckio.BuildConfig
import com.gabriel.chuckio.util.RetrofitUtils.getAPI
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApiModule {

    @Singleton
    @Provides
    fun providesApi(): ChuckApi {
        return getAPI(ChuckApi::class.java, BuildConfig.BASE_URL)
    }
}