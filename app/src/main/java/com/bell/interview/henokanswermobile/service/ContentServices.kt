package com.bell.interview.henokanswermobile.service

import com.bell.interview.henokanswermobile.api.BellContentApi
import com.bell.interview.henokanswermobile.entity.BellContent
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers

/**
 * Services layer acts as a domain separator between the mobile app's domain and the external API domain.
 * Ideally, we would define a different object to be returned and not re-use the API domain's "BellContent" object.
 */
class ContentServices constructor(
    private val bellCustomerApi: BellContentApi
) {

    fun findContentById(contentId: String) : Single<BellContent> {
        return bellCustomerApi.getContentById(contentId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}