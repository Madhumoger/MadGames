package com.sample.search.domain.di

import com.sample.search.domain.useCases.SearchGamesUseCase
import org.koin.dsl.module

fun getSearchDomainModule() = module {
    factory { SearchGamesUseCase(searchRepository = get()) }
}