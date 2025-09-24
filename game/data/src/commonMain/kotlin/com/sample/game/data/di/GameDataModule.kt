package com.sample.game.data.di


//for koin injection of repository
import com.sample.game.data.repository.GameRepositoryImpl
import com.sample.game.domain.repository.GameRepository
import org.koin.dsl.ModuleDeclaration
import org.koin.dsl.module

fun getGameDateModule() = module {
    factory<GameRepository> { GameRepositoryImpl(apiService = get()) } // every we need for each repository
}