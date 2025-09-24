package com.sample.game.data.repository

import com.sample.common.data.mappers.toDomainListOfGames
import com.sample.common.domain.model.Game
import com.sample.coreNetwork.apiService.ApiService
import com.sample.game.domain.repository.GameRepository

class GameRepositoryImpl(
    private val apiService: ApiService, ) : GameRepository {

    override suspend fun getGames(): Result<List<Game>> {
        val result = apiService.getGames()
        return if (result.isSuccess) {
            Result.success(result.getOrThrow().results.toDomainListOfGames())
        } else {
            Result.failure(result.exceptionOrNull()!!)
        }
    }

}