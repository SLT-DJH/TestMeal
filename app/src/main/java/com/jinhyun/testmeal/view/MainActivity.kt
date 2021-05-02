package com.jinhyun.testmeal.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jinhyun.testmeal.R
import com.jinhyun.testmeal.constants.Constants
import com.jinhyun.testmeal.retrofit.methods.MealAPIMethods
import com.jinhyun.testmeal.retrofit.response.mealdata.MealDataErrorResponse
import com.jinhyun.testmeal.retrofit.response.mealdata.MealDataOkResponse
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MealAPIMethods.mealList(
            Constants.VALIDATION_KEY,
            "json",
            "B10",
            "7010193",
            1,
            30
        ){
            response ->

            when(response) {
                is MealDataOkResponse -> {

                    val posts = response.mealServiceDietInfo
                    val row = posts[1].row

                    tv_result.append("\n")

                    for(i in 0 until row!!.size){
                        var content = ""
                        content += "date: ${row[i].mlsvYmd} \n"
                        content += "time: ${row[i].mmealScNm} \n"
                        content += "menu: ${row[i].ddishNm} \n"
                        content += "\n"

                        tv_result.append(content)
                    }
                }
                is MealDataErrorResponse -> {
                    Toast.makeText(applicationContext, response.result.message, Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(applicationContext, "실패", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
