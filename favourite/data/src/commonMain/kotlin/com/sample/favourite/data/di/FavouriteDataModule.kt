package com.sample.favourite.data.di

import com.sample.coreDatabase.AppDatabase
import com.sample.favourite.data.repository.FavoriteRepoImpl
import com.sample.favourite.domain.repository.*
import org.koin.core.module.Module
import org.koin.dsl.module

fun getFavoriteDataModule() : Module{
    return module {
        factory<FavoriteRepository> { FavoriteRepoImpl(get<AppDatabase>()) }
    }
}