package com.shaunhossain.retrofitkotilbasic2.network

import com.shaunhossain.retrofitkotilbasic2.model.SportsInfo
import retrofit2.Response
import retrofit2.http.GET

interface NetworkApi {
    @GET("/api/v1/json/1/all_sports.php/sports")
     suspend fun getAllSportsInfo() : Response<SportsInfo>
}