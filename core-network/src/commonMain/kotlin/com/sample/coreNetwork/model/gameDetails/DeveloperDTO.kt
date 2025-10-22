package com.sample.coreNetwork.model.gameDetails

import kotlinx.serialization.Serializable

@Serializable
data class DeveloperDTO(
    val gamesCount: Int,
    val id: Int,
    val imageBackground: String,
    val name: String,
    val slug: String
)
