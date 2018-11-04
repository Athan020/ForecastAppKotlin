package com.athandile.forecastapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.athandile.forecastapp.data.db.entity.CURRENT_WEATHER_ID
import com.athandile.forecastapp.data.db.entity.Current
import com.athandile.forecastapp.data.db.unilocalized.ImperialCurrentWeatherEntry
import com.athandile.forecastapp.data.db.unilocalized.MetricCurrentWeatherEntry

@Dao
interface CurrentWeatherDao {

    @Insert(onConflict =  OnConflictStrategy.REPLACE)

    fun upsert(current: Current)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID" )
    fun getWeatherMetric():LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID" )
    fun getImperialWeather():LiveData<ImperialCurrentWeatherEntry>
}