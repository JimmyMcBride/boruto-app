package com.example.borutoapp.di

import android.content.Context
import androidx.room.Room
import com.example.borutoapp.data.local.BorutoDatabase
import com.example.borutoapp.util.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        BorutoDatabase::class.java,
        BORUTO_DATABASE
    ).build()
}