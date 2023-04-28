package com.example.jetweatherforecastapp.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetweatherforecastapp.screens.MainScreen
import com.example.jetweatherforecastapp.screens.WeatherSplashScreen
import com.example.jetweatherforecastapp.screens.main.MainViewModel
import com.example.jetweatherforecastapp.screens.search.SearchScreen

@Composable
fun WeatherNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = WeatherScreens.SplashScreen.name) {
        composable(WeatherScreens.SplashScreen.name) {
            WeatherSplashScreen(navController = navController)
        }

        composable(WeatherScreens.MainScreen.name) {
            val mainViewModel = hiltViewModel<MainViewModel>()
            MainScreen(navController = navController, mainViewModel)
        }

        composable(WeatherScreens.SearchScreen.name) {
            val mainViewModel = hiltViewModel<MainViewModel>()
            SearchScreen(navController = navController)
        }

    }
}