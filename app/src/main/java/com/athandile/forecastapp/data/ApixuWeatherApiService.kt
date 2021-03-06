package com.athandile.forecastapp.data

import com.athandile.forecastapp.data.network.Response.currentWeather.currentWeatherResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY ="55f336e1ce8349918c3192154182810"
const val BASE_URL = "https://api.apixu.com/v1/"
interface ApixuWeatherApiService {

    @GET("current.json")
    fun getCurrentWeather(
          @Query("q")  location:String,
          @Query("lang") languageCode :String ="en"
    ):Deferred<currentWeatherResponse>
    @GET("forecast.json")
    fun getForecastWeather(
            @Query("q") location: String,
            @Query("days") days:Int = 7,
            @Query("lang") languageCode: String ="en"
    )

    companion object {

        //"https://api.apixu.com/v1/"current.json?q=Cape Town%lang=en
        operator fun invoke(): ApixuWeatherApiService{
            val requestInterceptor = Interceptor{ chain->
                val url = chain.request()
                        .url()
                        .newBuilder()
                        .addQueryParameter("key", API_KEY)
                        .build()
                //"https://api.apixu.com/v1/"current.json?q=Cape Town%lang=en%key=55f336e1ce8349918c3192154182810
                val request = chain.request()
                        .newBuilder()
                        .url(url)
                        .build()

                return@Interceptor chain.proceed(request)

            }

            val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor(requestInterceptor)
                    .build()

            return  Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl("https://api.apixu.com/v1/")
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(ApixuWeatherApiService::class.java)

        }
    }
}