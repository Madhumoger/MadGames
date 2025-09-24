package com.sample.gamopedia.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform