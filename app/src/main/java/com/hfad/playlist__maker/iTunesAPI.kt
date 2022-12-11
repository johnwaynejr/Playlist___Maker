package com.hfad.playlist___maker

import com.hfad.playlist___maker.SongResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface iTunesAPI {
       @GET("/search?entity")
       fun search(@Query("term") text: String): Call<SongResponse>

}