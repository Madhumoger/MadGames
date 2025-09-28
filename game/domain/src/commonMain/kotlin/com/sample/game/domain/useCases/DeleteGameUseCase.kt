package com.sample.game.domain.useCases

import com.sample.game.domain.repository.GameRepository

class DeleteUseCase (private val gameRepository: GameRepository) {

    suspend operator fun invoke(id:Int) = gameRepository.delete(id)

}