package com.sample.coreNetwork.model.game

import kotlinx.serialization.Serializable

@Serializable
data class Result(
    val backgroundImage: String,
    val id: Int,
    val name: String,
)