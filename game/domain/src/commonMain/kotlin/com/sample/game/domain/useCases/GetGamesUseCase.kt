package com.sample.game.domain.useCases

import androidx.compose.runtime.snapshots.SnapshotApplyResult
import com.sample.game.domain.model.Game
import com.sample.game.domain.repository.GameRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class GetGamesUseCase(private val gameRepository: GameRepository) {
    operator fun invoke() = flow<Result<List<Game>>> {
        emit(gameRepository.getGames())
    }.catch { error ->
        emit(Result.failure(error))
    }.flowOn(Dispatchers.IO)
}