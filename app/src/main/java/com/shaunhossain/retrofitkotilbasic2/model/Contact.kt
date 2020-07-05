package com.shaunhossain.retrofitkotilbasic2.model

import com.shaunhossain.retrofitkotilbasic2.model.PhoneX

data class Contact(
    val address: String,
    val email: String,
    val gender: String,
    val id: String,
    val name: String,
    val phone: PhoneX
)