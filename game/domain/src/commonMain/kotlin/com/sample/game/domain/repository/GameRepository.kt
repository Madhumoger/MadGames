package com.sample.game.domain.repository

import com.sample.common.domain.model.Game
import com.sample.game.domain.model.GameDetails


interface GameRepository {

    suspend fun getGames(): Result<List<Game>>

    suspend fun getDetails(id: Int): Result<GameDetails>

    suspend fun save(id: Int, image: String, name: String)

    suspend fun delete(id: Int)
}