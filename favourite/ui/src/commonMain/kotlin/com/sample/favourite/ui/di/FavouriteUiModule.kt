package com.sample.favourite.ui.di

import com.sample.favourite.ui.FavouriteViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

fun getFavoriteUiModule(): Module{
    return module {
        viewModel { FavouriteViewModel(
            getAllLocalCahcedGamesUseCase = get(),
            deleteUseCase = get()
        ) }
    }
}