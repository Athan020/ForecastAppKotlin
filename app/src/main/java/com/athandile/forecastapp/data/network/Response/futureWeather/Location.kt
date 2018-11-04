package com.athandile.forecastapp.data.network.Response.futureWeather

data class Location(
	val localtime: String? = null,
	val country: String? = null,
	val localtimeEpoch: Int? = null,
	val name: String? = null,
	val lon: Double? = null,
	val region: String? = null,
	val lat: Double? = null,
	val tzId: String? = null
)
