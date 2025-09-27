package com.sample.game.ui.di

import com.sample.game.ui.game.GameViewModel
import com.sample.game.ui.gameDetails.GameDetailsViewModel
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModel

fun getGameUiModule() = module {
    viewModel { GameViewModel(
        getGameUsecase = get()
    ) }
    viewModel {
        GameDetailsViewModel(
            getGameDetailsUseCase = get(),
//            saveGameUseCase = get(),
//            deleteUseCase = get(),
        )
    }
}