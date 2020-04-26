package com.bell.interview.henokanswermobile.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bell.interview.henokanswermobile.factory.UseCaseFactory

/**
 * View model factory for MainViewModel.
 */
class MainViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(UseCaseFactory.createGetLastModifiedDateUserCase()) as T
    }
}