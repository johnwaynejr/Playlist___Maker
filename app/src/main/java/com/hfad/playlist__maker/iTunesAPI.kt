package com.hfad.playlist___maker

import com.hfad.playlist___maker.SongResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface iTunesAPI {
       @GET("/search?entity={expression}")
       fun search(@Path("expression") expression: String): Call<SongResponse>

}