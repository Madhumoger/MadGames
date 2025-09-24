package com.sample.common.data.mappers


import com.sample.common.domain.model.Game
import com.sample.coreNetwork.model.game.Result

fun List<Result>.toDomainListOfGames() :List<Game> = map { game ->
    Game(
        id = game.id,
        name = game.name,
        imageUrl = game.background_image
    )
}

