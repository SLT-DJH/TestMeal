package com.jinhyun.testmeal.retrofit

import com.jinhyun.testmeal.retrofit.service.TestMealService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    companion object {
        private const val baseUrl = "https://open.neis.go.kr"

        val retrofit : Retrofit = Retrofit.Builder()
            .baseUrl(this.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val testMeal : TestMealService = retrofit.create(TestMealService::class.java)
    }
}