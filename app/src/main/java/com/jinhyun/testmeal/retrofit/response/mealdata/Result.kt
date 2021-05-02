package com.jinhyun.testmeal.retrofit.response.mealdata

import com.google.gson.annotations.SerializedName

data class Result (
    @SerializedName("CODE")
    val code: String,
    @SerializedName("MESSAGE")
    val message: String
)