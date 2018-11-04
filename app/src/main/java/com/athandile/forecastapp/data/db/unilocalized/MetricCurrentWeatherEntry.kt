package com.athandile.forecastapp.data.db.unilocalized

import androidx.room.ColumnInfo

data class MetricCurrentWeatherEntry
(
        @ColumnInfo(name = "temp_C")
        override val temprature: Double,
        @ColumnInfo(name = "condition_text")
        override val conditionText: String,
        @ColumnInfo(name = "condition_icon")
        override val conditionIconUrl: String,
        @ColumnInfo(name = "windKph")
        override val windSpeed: Double,
        @ColumnInfo(name = "windDir")
        override val windDirection: String,
        @ColumnInfo(name = "precepMm")
        override val precepitationVolume: Double,
        @ColumnInfo(name = "feelslikeC")
        override val feelsLikeTemprature: Double,
        @ColumnInfo(name = "visKm")
        override val visbilityDistance: Double
):UnitSpecficCurrentWeatherEntry