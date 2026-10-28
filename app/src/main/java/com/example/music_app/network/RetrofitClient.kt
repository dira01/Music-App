package com.example.music_app.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//ARCHVO PARA CONSTRUIR TOD0 EL ENLACE DEL API

object RetrofitClient {

    //colocar la base url
    private const val BASE_URL = "https://itunes.apple.com/"

    //construir la url completa
    val api : ITunesApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ITunesApi::class.java)
    }

}