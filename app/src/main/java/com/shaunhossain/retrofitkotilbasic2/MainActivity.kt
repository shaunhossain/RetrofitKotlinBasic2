package com.shaunhossain.retrofitkotilbasic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shaunhossain.retrofitkotilbasic2.Constant.Companion.BASE_URL
import com.shaunhossain.retrofitkotilbasic2.network.NetworkApi
import com.shaunhossain.retrofitkotilbasic2.repos.Repository
import com.shaunhossain.retrofitkotilbasic2.repos.Repository.Companion.getSportsInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.IO){

            val comments = getSportsInfo()
            if (comments.isSuccessful){
                Log.d(TAG,comments.body().toString())
            }
        }
    }
}