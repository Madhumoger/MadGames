package com.sample.favourite.domain.di

import com.sample.favourite.domain.useCases.DeleteUseCase
import com.sample.favourite.domain.useCases.GetAllLocalCahcedGamesUseCase
import com.sample.favourite.domain.useCases.UpsertUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

fun getFavoriteDomainModule(): Module {
    return module {
        factory { DeleteUseCase(get()) }
        factory { GetAllLocalCahcedGamesUseCase(get()) }
        factory { UpsertUseCase(get()) }
    }
}