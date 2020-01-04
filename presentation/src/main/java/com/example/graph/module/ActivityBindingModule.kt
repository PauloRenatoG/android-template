package com.example.graph.module

import com.example.graph.scope.ActivityScope
import com.example.template.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity
}