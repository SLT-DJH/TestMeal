package com.jinhyun.testmeal.retrofit.service

import com.jinhyun.testmeal.retrofit.response.mealdata.MealDataOkResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TestMealService {
    @GET("/hub/mealServiceDietInfo")
    fun mealList(
        @Query("KEY") validationKey : String,
        @Query("Type") contentType : String,
        @Query("ATPT_OFCDC_SC_CODE") officeCode : String,
        @Query("SD_SCHUL_CODE") schoolCode : String,
        @Query("pIndex") index : Int,
        @Query("pSize") size : Int
    ) : Call<MealDataOkResponse>
}