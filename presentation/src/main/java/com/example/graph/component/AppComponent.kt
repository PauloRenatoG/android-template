package com.example.graph.component

import android.content.Context
import com.example.ApplicationComponent
import com.example.graph.module.ApiProviderModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ApiProviderModule::class
    ]
)
interface AppComponent {

    fun inject(applicationComponent: ApplicationComponent): ApplicationComponent

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}