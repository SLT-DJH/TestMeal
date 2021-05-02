package com.jinhyun.testmeal.retrofit.response.mealdata

import com.google.gson.annotations.SerializedName

data class Head (
    @SerializedName("list_total_count")
    val listTotalCount: Long,
    @SerializedName("RESULT")
    val result: Result
)