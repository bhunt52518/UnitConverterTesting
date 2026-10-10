package com.example.unitconvertertesting

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ConversionModule {

    @Binds
    @Singleton
    abstract fun bindConversionService(
        defaultConversionService: DefaultConversionService
    ): ConversionService
}