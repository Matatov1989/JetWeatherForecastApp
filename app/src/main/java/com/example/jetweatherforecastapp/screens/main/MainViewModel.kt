package com.example.jetweatherforecastapp.screens.main

import androidx.lifecycle.ViewModel
import com.example.jetweatherforecastapp.data.DataOrException
import com.example.jetweatherforecastapp.model.Weather
import com.example.jetweatherforecastapp.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: WeatherRepository) : ViewModel() {

    suspend fun getWeatherData(city: String, units: String): DataOrException<Weather,Boolean, Exception> {
        return repository.getWeather(cityQuery = city, units = units)
    }



}