package com.athandile.forecastapp.data.Response.futureWeather

data class Current(
        val feelslikeC: Double? = null,
        val lastUpdated: String? = null,
        val feelslikeF: Double? = null,
        val windDegree: Int? = null,
        val lastUpdatedEpoch: Int? = null,
        val isDay: Int? = null,
        val precipIn: Double? = null,
        val windDir: String? = null,
        val tempC: Double? = null,
        val pressureIn: Double? = null,
        val tempF: Double? = null,
        val precipMm: Double? = null,
        val cloud: Int? = null,
        val windKph: Double? = null,
        val condition: Condition? = null,
        val windMph: Double? = null,
        val visKm: Double? = null,
        val humidity: Int? = null,
        val pressureMb: Double? = null,
        val visMiles: Double? = null
)
