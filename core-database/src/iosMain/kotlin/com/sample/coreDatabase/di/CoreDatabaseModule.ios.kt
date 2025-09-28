package com.sample.coreDatabase.di


import app.cash.sqldelight.db.SqlDriver
import com.sample.coreDatabase.AppDatabase
import com.sample.coreDatabase.SqlDriverFactory
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun getCoreDatabaseModule(): Module {
    return module {
        single { SqlDriverFactory().getSqlDriver() }
        single { AppDatabase.invoke(get<SqlDriver>()) }

    }
}