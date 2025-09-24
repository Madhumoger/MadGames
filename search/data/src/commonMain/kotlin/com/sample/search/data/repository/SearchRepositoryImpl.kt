package com.sample.search.data.repository

import com.sample.common.data.mappers.toDomainListOfGames
import com.sample.common.domain.model.Game
import com.sample.coreNetwork.apiService.ApiService
import com.sample.search.domain.repository.SearchRepository


class SearchRepositoryImpl(
    private val apiService: ApiService
) : SearchRepository {

    override suspend fun search(q: String): Result<List<Game>> {
        return try {
            val response = apiService.search(q)
            val data = response.getOrThrow().results.toDomainListOfGames()
            Result.success(data)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}