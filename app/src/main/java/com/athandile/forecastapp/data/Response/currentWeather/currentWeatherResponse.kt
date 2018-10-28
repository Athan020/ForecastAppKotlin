package com.athandile.forecastapp.data.Response.currentWeather
import com.google.gson.annotations.SerializedName
data class currentWeatherResponse(
        val location: Location,
        @SerializedName("temp_c")
        val current: Current
)