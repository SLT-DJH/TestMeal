package com.jinhyun.testmeal.retrofit.methods

import android.util.Log
import com.jinhyun.testmeal.retrofit.utils.ErrorUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MethodCallback {

    companion object {

        inline fun <G, O : G, reified E : G> generalCallback(crossinline callback: (response: G?) -> Unit): Callback<O> {
            Log.d("generalCallback", "here")
            return object : Callback<O> {
                override fun onFailure(call: Call<O>, t: Throwable) {
                    Log.d("TestMealAPI::", "Failed API call with call: $call exception: $t")
                }

                override fun onResponse(call: Call<O>, response: Response<O>) {
                    Log.d("TestMealAPI::", "Success ! : $call, response : ${response.code()}")
                    if (response.isSuccessful) {
                        callback(response.body())
                    } else {
                        if (response.errorBody() != null) {

                            when (response.code()) {
                                400 -> {
                                    val errorBody: E? =
                                        ErrorUtils.getErrorResponse<E>(response.errorBody()!!)

                                    if (errorBody != null) {
                                        callback(errorBody)
                                    } else {
                                        callback(null)
                                    }
                                }
                                else -> {
                                    callback(null)
                                }
                            }
                        } else {
                            callback(null)
                        }
                    }
                }
            }
        }
    }

}