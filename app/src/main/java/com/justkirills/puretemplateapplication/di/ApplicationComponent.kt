package com.justkirills.puretemplateapplication.di

import com.justkirills.puretemplateapplication.App
import com.justkirills.puretemplateapplication.di.module.AppModule
import com.justkirills.puretemplateapplication.di.module.MainActivityModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [AndroidSupportInjectionModule::class,
        AppModule::class,
        MainActivityModule::class]
)
@Singleton
interface ApplicationComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory : AndroidInjector.Factory<App>
}
