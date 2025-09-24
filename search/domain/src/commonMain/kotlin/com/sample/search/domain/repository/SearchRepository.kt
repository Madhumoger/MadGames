package com.sample.search.domain.repository

import com.sample.common.domain.model.Game


interface SearchRepository {
    suspend fun search(q: String): Result<List<Game>>
}