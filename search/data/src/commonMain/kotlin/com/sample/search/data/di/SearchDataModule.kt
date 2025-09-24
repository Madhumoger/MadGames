package com.sample.search.data.di

import com.sample.search.data.repository.SearchRepositoryImpl
import com.sample.search.domain.repository.SearchRepository
import org.koin.dsl.module

fun getSearchDataModule() = module {
    factory<SearchRepository> { SearchRepositoryImpl(apiService = get()) }
}