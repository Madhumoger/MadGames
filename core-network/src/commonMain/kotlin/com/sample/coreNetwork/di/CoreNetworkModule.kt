package com.sample.coreNetwork.di

import com.sample.coreNetwork.apiService.ApiService
import com.sample.coreNetwork.client.KtorClient
import org.koin.dsl.module

fun getCoreNetworkModule() = module {
    single { ApiService(httpClient = KtorClient.getInstance()) }
}