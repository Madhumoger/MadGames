package com.sample.favourite.domain.useCases

import com.sample.favourite.domain.repository.FavoriteRepository

class GetAllLocalCahcedGamesUseCase(private val favoriteRepository: FavoriteRepository) {

    operator fun invoke() = favoriteRepository.getAllGames()

}