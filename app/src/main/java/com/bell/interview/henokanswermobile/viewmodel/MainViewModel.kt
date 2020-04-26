package com.bell.interview.henokanswermobile.viewmodel

import androidx.lifecycle.ViewModel
import com.bell.interview.henokanswermobile.usecase.GetLastModifiedDateUseCase
import io.reactivex.Single


/**
 * View model layer that is only concerned with view related logic.
 * Delegates and business logic to the use-case layer.
 */
class MainViewModel constructor(
    val getLastModifiedDateUseCase: GetLastModifiedDateUseCase
) : ViewModel() {

    fun getLastModifiedDate(contentId: String) : Single<String> {
        return getLastModifiedDateUseCase.getLastModifiedDate(contentId)
    }

}