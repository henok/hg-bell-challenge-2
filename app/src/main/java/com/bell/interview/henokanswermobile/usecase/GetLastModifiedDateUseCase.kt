package com.bell.interview.henokanswermobile.usecase

import com.bell.interview.henokanswermobile.service.ContentServices
import io.reactivex.Single
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Usecase layer is where business logic should be placed.
 * This layer does not concern itself with view logic or data access logic.
 */
class GetLastModifiedDateUseCase constructor(
    private val contentServices: ContentServices
) {

    /**
     * This function will retrieve the bell content record and return just the formatted value of LastModifiedDateTime.
     *
     * For example, we will convert "2020-02-10T15:49:05Z" to "February 10, 2020 3:49 pm"
     *
     */
    fun getLastModifiedDate(contentId: String) : Single<String>{
        return contentServices.findContentById(contentId)
            .map {
                convertToHumanReadableDate(it.lastModifiedDateTime)
            }
    }

    private fun convertToHumanReadableDate(inputDate: String?) : String {
        var convertedDate = inputDate
        inputDate?.let {
            try {
                val dateTime = LocalDateTime.parse(inputDate, DateTimeFormatter.ISO_DATE_TIME)
                val dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy hh:mm")
                convertedDate = dateTime.format(dateTimeFormatter)
            }
            catch(e: Exception) {
                // if unable to parse date, return original string
            }
        }
        return convertedDate!!
    }

}