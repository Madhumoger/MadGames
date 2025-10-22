package com.sample.favourite.ui.di

import com.sample.favourite.ui.FavoriteViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

fun getFavoriteUiModule(): Module{
    return module {
        viewModel {
            FavoriteViewModel(
                getAllLocalCachedGamesUseCase = get(),
                deleteUseCase = get()
            )
        }
    }
}