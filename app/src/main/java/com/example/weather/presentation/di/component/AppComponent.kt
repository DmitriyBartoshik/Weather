package com.example.weather.presentation.di.component

import com.example.weather.presentation.MainActivity
import com.example.weather.presentation.WeatherApp
import com.example.weather.presentation.di.module.AppModule
import com.example.weather.presentation.di.module.DataModule
import dagger.Component


@Component(modules = [AppModule::class, DataModule::class])
interface AppComponent {
    fun inject(application: WeatherApp)

    fun inject(mainActivity: MainActivity)
}