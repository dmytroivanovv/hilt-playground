package com.dmytroivanovv.hiltplayground.di

import android.os.Build
import com.dmytroivanovv.hiltplayground.LineRepository
import com.dmytroivanovv.hiltplayground.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Named

@Module
@InstallIn(ViewModelComponent::class)
class LineModule {

    @Provides
    @ViewModelScoped
    fun provideReader(): Repository {
        return LineRepository()
    }

    @Provides
    @ViewModelScoped
    @Named("str")
    fun provideString(): String {
        return Build.ID
    }
}