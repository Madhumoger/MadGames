package com.sample.game.domain.di

import com.sample.game.domain.useCases.GetGamesUseCase
import org.koin.dsl.module

fun getGameDomainModule() = module{
    factory { GetGamesUseCase(gameRepository = get()) }
//    factory { GetGameDetailsUseCase(gameRepository = get()) }
//    factory { SaveGameUseCase(gameRepository = get()) }
//    factory { DeleteUseCase(gameRepository = get()) }
}