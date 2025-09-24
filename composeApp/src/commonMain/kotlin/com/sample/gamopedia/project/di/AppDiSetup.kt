package com.sample.gamopedia.project.di

import com.sample.coreNetwork.di.getCoreNetworkModule
import com.sample.game.domain.di.getGameDomainModule
import com.sample.game.data.di.getGameDateModule
import com.sample.game.ui.di.getGameUiModule
import com.sample.search.data.di.getSearchDataModule
import com.sample.search.domain.di.getSearchDomainModule
import com.sample.search.ui.di.getSearchUiModule
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

fun initKoin(koinApplication: ((KoinApplication) -> Unit)? = null) {
    startKoin {
        koinApplication?.invoke(this)
        modules(
            getCoreNetworkModule(),
            getGameDateModule(),
            getGameDomainModule(),
            getGameUiModule(),
            getSearchDataModule(),
            getSearchDomainModule(),
            getSearchUiModule(),
//            getCoreDatabaseModule(),
//            getFavoriteDataModule(),
//            getFavoriteDomainModule(),
//            getFavoriteUiModule()
        )
    }
}