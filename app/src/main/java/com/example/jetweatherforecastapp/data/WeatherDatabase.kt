package com.example.jetweatherforecastapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jetweatherforecastapp.model.Favorite
import com.example.jetweatherforecastapp.model.Unit

@Database(entities = [Favorite::class, Unit::class], version = 2, exportSchema = false)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}
