package com.sample.coreNetwork.apiService

import com.sample.coreNetwork.model.game.GameResponse
import com.sample.coreNetwork.model.gameDetails.GameDetailsResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class ApiService(
    val httpClient: HttpClient,
) {

    // https://api.rawg.io/api/games?key=e211ac3c7c2d455880b1dfb392b5be64

    suspend fun getGames(): Result<GameResponse> {
        return try {
            val response = httpClient.get("api/games") {
                url {
                    parameter("key", "e211ac3c7c2d455880b1dfb392b5be64")
                }
            }.body<GameResponse>()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }


    suspend fun search(q: String): Result<GameResponse> {
        return try {
            val response = httpClient.get("api/games") {
                url {
                    parameter("key", "e211ac3c7c2d455880b1dfb392b5be64")
                    parameter("search", q)
                }
            }.body<GameResponse>()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    // https://api.rawg.io/api/games/4200?key=e211ac3c7c2d455880b1dfb392b5be64

    suspend fun getDetails(id: Int): Result<GameDetailsResponse> {
        return try {
            val response = httpClient.get("api/games/${id}") {
                url {
                    parameter("key", "e211ac3c7c2d455880b1dfb392b5be64")
                }
            }.body<GameDetailsResponse>()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

}