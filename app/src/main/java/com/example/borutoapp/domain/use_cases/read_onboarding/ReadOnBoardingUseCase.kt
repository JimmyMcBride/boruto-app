package com.example.borutoapp.domain.use_cases.read_onboarding

import androidx.paging.ExperimentalPagingApi
import com.example.borutoapp.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase constructor(
    private val repository: Repository
) {
    operator fun invoke(): Flow<Boolean> {
        return repository.readOnBoardingState()
    }
}