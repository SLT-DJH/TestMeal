package com.jinhyun.testmeal.retrofit.methods

import com.jinhyun.testmeal.retrofit.RetrofitService
import com.jinhyun.testmeal.retrofit.response.mealdata.MealDataErrorResponse
import com.jinhyun.testmeal.retrofit.response.mealdata.MealDataOkResponse
import com.jinhyun.testmeal.retrofit.response.mealdata.MealDataResponse

class MealAPIMethods {
    companion object {
        fun mealList(
            validationKey : String,
            contentType : String,
            officeCode : String,
            schoolCode : String,
            index : Int,
            size : Int,
            callback : (response : MealDataResponse?) -> Unit
        ) {
            RetrofitService.testMeal.mealList(
                validationKey,
                contentType,
                officeCode,
                schoolCode,
                index,
                size
            ).enqueue(
                MethodCallback.generalCallback<MealDataResponse, MealDataOkResponse, MealDataErrorResponse>(
                callback
                )
            )
        }
    }
}