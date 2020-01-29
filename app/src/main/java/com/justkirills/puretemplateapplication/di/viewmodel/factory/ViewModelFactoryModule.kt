package com.justkirills.puretemplateapplication.di.viewmodel.factory

import androidx.lifecycle.ViewModelProvider
import com.justkirills.puretemplateapplication.di.viewmodel.factory.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}