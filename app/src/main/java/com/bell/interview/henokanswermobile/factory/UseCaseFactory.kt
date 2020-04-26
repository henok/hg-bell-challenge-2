package com.bell.interview.henokanswermobile.factory

import com.bell.interview.henokanswermobile.api.BellContentApi
import com.bell.interview.henokanswermobile.service.ContentServices
import com.bell.interview.henokanswermobile.usecase.GetLastModifiedDateUseCase
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object UseCaseFactory {

    const val BELL_BASE_URL = "https://capi.stage.9c9media.com/"

    fun createGetLastModifiedDateUserCase() : GetLastModifiedDateUseCase {
        return GetLastModifiedDateUseCase(
            ContentServices(buildContentApiRetrofitClient())
        )
    }

    private fun buildContentApiRetrofitClient(): BellContentApi {
        return Retrofit.Builder()
            .baseUrl(BELL_BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BellContentApi::class.java)
    }

}