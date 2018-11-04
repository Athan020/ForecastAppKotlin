package com.athandile.forecastapp.data.db.unilocalized

interface UnitSpecficCurrentWeatherEntry {
    val temprature: Double
    val conditionText: String
    val conditionIconUrl: String
    val windSpeed:Double
    val windDirection:String
    val precepitationVolume:Double
    val feelsLikeTemprature: Double
    val visbilityDistance: Double
}