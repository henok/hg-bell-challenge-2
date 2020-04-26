package com.bell.interview.henokanswermobile.api

import com.bell.interview.henokanswermobile.entity.BellContent
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * This is a direct one-to-one mapping with the backend API domain and is not
 * technically part of this application domain model. Hence it is important to
 * keep seperation of concerns between BellContentApi and the current application.
 */
interface BellContentApi {

    @GET("destinations/tsn_ios/platforms/iPad/contents/{contentId}")
    fun getContentById(@Path("contentId") contentId: String): Single<BellContent>

}