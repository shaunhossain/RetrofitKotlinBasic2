package com.shaunhossain.retrofitkotilbasic2

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface NetworkApi {
    @GET("/api/v1/json/1/all_sports.php/sports")
     suspend fun getAllSportsInfo() : Response<SportsInfo>
}