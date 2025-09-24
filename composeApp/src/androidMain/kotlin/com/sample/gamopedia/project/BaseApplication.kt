package com.sample.gamopedia.project

import android.app.Application
import com.sample.gamopedia.project.di.initKoin
import org.koin.dsl.module

class BaseApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        initKoin{
            it.modules(
                module{
                    single { this@BaseApplication.applicationContext }
                }
            )
        }
    }
}