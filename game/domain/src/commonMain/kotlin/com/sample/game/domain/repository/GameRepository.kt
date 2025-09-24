package com.sample.game.domain.repository

import com.sample.game.domain.model.Game

interface GameRepository {

    suspend fun getGames(): Result<List<Game>>
}