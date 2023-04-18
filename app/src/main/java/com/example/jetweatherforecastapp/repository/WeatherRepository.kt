package com.example.jetweatherforecastapp.repository

import com.example.jetweatherforecastapp.data.DataOrException
import com.example.jetweatherforecastapp.model.Weather
import com.example.jetweatherforecastapp.model.WeatherObject
import com.example.jetweatherforecastapp.network.WeatherApi
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val api: WeatherApi){

    suspend fun getWeather(cityQuery: String): DataOrException<Weather, Boolean, Exception> {
        val response = try {
            api.getWeather(query = cityQuery)
        } catch (e: Exception) {
            return DataOrException(e = e)
        }
        return DataOrException(data = response)

    }

}