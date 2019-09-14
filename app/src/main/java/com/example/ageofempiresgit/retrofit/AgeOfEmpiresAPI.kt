package com.example.ageofempiresgit.retrofit

import com.example.ageofempiresgit.model.Civilization
import com.example.ageofempiresgit.model.Structure
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.concurrent.TimeUnit

// TODO 5: S05M02-5 Add the networking calls
interface StarWarsAPI {
    @GET("/civilization/{id}")
    fun getCivilization(id: Int): Call<Civilization>

    @GET("/structure/{id}")
    fun getStructure(id:Int):Call<Structure>

    @GET("/unit/{id}")
    fun getUnit(id: Int): Call<Unit>

    class Factory {



        companion object {

            private const val BASE_URL = "https://swapi.co/api/"

            fun create(): StarWarsAPI {

                val logger = HttpLoggingInterceptor()
                logger.level = HttpLoggingInterceptor.Level.BASIC

                val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor(logger)
                    .retryOnConnectionFailure(false)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .build()

                val retrofit = Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()


                return retrofit.create(StarWarsAPI::class.java)
            }
        }
    }
}