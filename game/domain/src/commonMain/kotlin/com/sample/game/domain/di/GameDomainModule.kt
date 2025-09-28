package com.sample.game.domain.di

import com.sample.game.domain.useCases.GetGameDetailsUseCase
import com.sample.game.domain.useCases.GetGamesUseCase
import com.sample.game.domain.useCases.SaveGameUseCase
import com.sample.game.domain.useCases.DeleteUseCase
import org.koin.dsl.module

fun getGameDomainModule() = module{
    factory { GetGamesUseCase(gameRepository = get()) }
    factory { GetGameDetailsUseCase(gameRepository = get()) }
    factory { SaveGameUseCase(gameRepository = get()) }
    factory { DeleteUseCase(gameRepository = get()) }
}