package com.example.graph.component

import com.example.ApplicationComponent
import com.example.graph.module.ActivityBindingModule
import com.example.graph.module.ApiProviderModule
import com.example.graph.module.ApplicationBindingModule
import com.example.graph.module.MapperModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ApiProviderModule::class,
        ActivityBindingModule::class,
        ApplicationBindingModule::class,
        MapperModule::class
    ]
)
interface AppComponent : AndroidInjector<ApplicationComponent>