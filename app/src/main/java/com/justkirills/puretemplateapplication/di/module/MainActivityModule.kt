package com.justkirills.puretemplateapplication.di.module

import com.justkirills.puretemplateapplication.di.module.FragmentBuildersModule
import com.justkirills.puretemplateapplication.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity
}