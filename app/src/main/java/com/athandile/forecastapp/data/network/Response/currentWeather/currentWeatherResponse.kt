package com.athandile.forecastapp.data.network.Response.currentWeather
import com.athandile.forecastapp.data.db.entity.Current
import com.athandile.forecastapp.data.db.entity.Location
import com.google.gson.annotations.SerializedName
data class currentWeatherResponse(
        val location: Location,
        @SerializedName("temp_c")
        val current: Current
)