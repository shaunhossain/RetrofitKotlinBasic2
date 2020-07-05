package com.shaunhossain.retrofitkotilbasic2.repos

import com.shaunhossain.retrofitkotilbasic2.network.RetrofitInstrance

class Repository {
    companion object{
        suspend fun getSportsInfo() = RetrofitInstrance.api.getAllSportsInfo()
    }
}