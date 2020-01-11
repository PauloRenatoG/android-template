package com.example

import android.content.Context
import androidx.multidex.MultiDex
import com.example.graph.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class ApplicationComponent : DaggerApplication() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<ApplicationComponent> {
        return DaggerAppComponent.create()
    }
}