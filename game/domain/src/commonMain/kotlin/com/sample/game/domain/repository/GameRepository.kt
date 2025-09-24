package com.sample.game.domain.repository

import com.sample.common.domain.model.Game


interface GameRepository {

    suspend fun getGames(): Result<List<Game>>
}