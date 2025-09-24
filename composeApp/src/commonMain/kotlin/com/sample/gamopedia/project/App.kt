package com.sample.gamopedia.project

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.sample.gamopedia.project.navigation.FavouriteNavGraph
import com.sample.gamopedia.project.navigation.GameNavGraph
import com.sample.gamopedia.project.navigation.SearchNavGraph

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navHostController = rememberNavController()
        val bottomPadding = WindowInsets.statusBars.asPaddingValues().calculateBottomPadding()
        NavHost(navHostController, startDestination = GameNavGraph.Dest.Root.route) {
            listOf(
                GameNavGraph,
                SearchNavGraph,
//                FavouriteNavGraph
            ).forEach {
                it.build(
                    modifier = Modifier.padding(top = bottomPadding).fillMaxSize(),
                    navHostController = navHostController,
                    navGraphBuilder = this
                )
            }
        }
    }
}