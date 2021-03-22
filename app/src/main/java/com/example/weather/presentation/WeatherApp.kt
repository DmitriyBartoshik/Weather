package com.example.weather.presentation

import android.app.Application
import com.example.weather.presentation.di.component.AppComponent
import com.example.weather.presentation.di.component.DaggerAppComponent

class WeatherApp: Application() {
    companion object {
        @JvmStatic
        lateinit var appComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()
//        graph = DaggerApplicationComponent
//            .builder()
//            .androidModule(AppModule(this)).build()
//
//        graph.inject(this)

        appComponent = DaggerAppComponent
            .builder()
//            .application(this)
            .build()

        appComponent.inject(this)
    }
}