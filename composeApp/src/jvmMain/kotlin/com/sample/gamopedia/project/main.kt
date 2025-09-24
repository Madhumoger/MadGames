package com.sample.gamopedia.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.sample.gamopedia.project.di.initKoin

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MadGames",
    ) {
        initKoin()
        App()
    }
}