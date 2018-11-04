package com.athandile.forecastapp.data.network.Response.futureWeather

data class FutureWeatherResponse(
		val current: Current? = null,
		val location: Location? = null,
		val forecast: Forecast? = null
)
