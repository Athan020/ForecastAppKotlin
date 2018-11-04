package com.athandile.forecastapp.data.db.unilocalized

import androidx.room.ColumnInfo

data class ImperialCurrentWeatherEntry
(
        @ColumnInfo(name = "temp_f")
        override val temprature: Double,
        @ColumnInfo(name = "condition_text")
        override val conditionText: String,
        @ColumnInfo(name = "condition_icon")
        override val conditionIconUrl: String,
        @ColumnInfo(name = "windMph")
        override val windSpeed: Double,
        @ColumnInfo(name = "windDir")
        override val windDirection: String,
        @ColumnInfo(name = "precepIn")
        override val precepitationVolume: Double,
        @ColumnInfo(name = "feelslikef")
        override val feelsLikeTemprature: Double,
        @ColumnInfo(name = "visMiles")
        override val visbilityDistance: Double

):UnitSpecficCurrentWeatherEntry
