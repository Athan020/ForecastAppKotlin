package com.athandile.forecastapp.data.network.Response.futureWeather

data class ForecastdayItem(
		val date: String? = null,
		val astro: Astro? = null,
		val dateEpoch: Int? = null,
		val day: Day? = null
)
