package com.shaunhossain.retrofitkotilbasic2.network

import com.shaunhossain.retrofitkotilbasic2.Constant.Companion.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstrance {
   companion object{
       private val retrofit by lazy {
           val logingInterceptor = HttpLoggingInterceptor()
           logingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

           val client = OkHttpClient.Builder()
               .addInterceptor(logingInterceptor)
               .build()
           Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(GsonConverterFactory.create())
               .client(client)
               .build()
       }

       val api by lazy {
           retrofit.create(NetworkApi::class.java)
       }
   }
}