package com.sample.favourite.domain.useCases

import com.sample.favourite.domain.repository.FavoriteRepository

class DeleteUseCase(private val favoriteRepository: FavoriteRepository) {

    suspend operator fun invoke(id: Int) = favoriteRepository.delete(id)

}