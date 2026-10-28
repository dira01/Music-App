package com.example.music_app.network

import android.R
import com.example.music_app.model.ITunesResponse
import retrofit2.http.GET
import retrofit2.http.Query

// ARCHIVO QUE GENRA LA PETICION AL API

interface ITunesApi {

    @GET("search")

    // METODOPARA BUSCAR EL ALBUM POR GENERO
    fun obtenerAlbumGenero(
        @Query("term") genero : String,
        @Query("country") pais : String,
        @Query("media") media : String,
        @Query("entity") entidad: String,
        @Query("limit") limite: Int,
    ) : retrofit2.Call<ITunesResponse>

}