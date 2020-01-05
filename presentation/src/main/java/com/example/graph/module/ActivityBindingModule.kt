package com.example.graph.module

import com.example.graph.scope.ActivityScope
import com.example.template.view.DashboardActivity
import com.example.template.view.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeMainActivity(): DashboardActivity

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeSplashActivity(): SplashActivity
}