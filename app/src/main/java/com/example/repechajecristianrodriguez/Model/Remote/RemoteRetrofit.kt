package com.example.repechajecristianrodriguez.Model.Remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//cambiar la direccion (base)

class RemoteRetrofit {

    companion object {

        private const val BASE_URL = "https://jp-conciertos.onrender.com/"

        lateinit var retrofitInstance: Retrofit
        fun retrofitInstance(): RemoteApi {
            val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                GsonConverterFactory.create()
            ).build()
            return retrofit.create(RemoteApi::class.java)
        }
    }
}