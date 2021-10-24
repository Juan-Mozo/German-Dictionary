package com.juanimozo.drinkscocktails.di

import android.app.Application
import com.juanimozo.drinkscocktails.drinks.data.data_source.Drinks
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModules {

    @Provides
    @Singleton
    fun provideDrinkList() : Drinks {
        return
    }

}