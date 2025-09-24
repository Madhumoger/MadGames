package com.sample.game.data.mappers

import com.sample.coreNetwork.model.game.Result
import com.sample.game.domain.model.Game

fun List<Result>.toDomainListOfGames() :List<Game> = map { game ->
    Game(
        id = game.id,
        name = game.name,
        imageUrl = game.background_image
    )
}
