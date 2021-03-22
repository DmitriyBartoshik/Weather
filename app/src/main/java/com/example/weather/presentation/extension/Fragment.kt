package com.example.weather.presentation.extension

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders


inline fun <reified T : ViewModel> Fragment.viewModel(factory: ViewModelProvider.Factory, body: T.() -> Unit): T {
        val vm = ViewModelProviders.of(this, factory)[T::class.java]
        vm.body()
        return vm
    }

//    private val viewModel: CurrentWeatherViewModel by lazy {
//        val activity = requireNotNull(this.activity) {
//        }
//        ViewModelProvider(this, CurrentWeatherViewModel.Factory(activity.application))
//            .get(CurrentWeatherViewModel::class.java)
//    }
//
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//
//    private val countriesViewModel: CurrentWeatherViewModel by viewModels {
//        viewModelFactory
//    }
