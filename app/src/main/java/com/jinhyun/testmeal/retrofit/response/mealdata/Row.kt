package com.jinhyun.testmeal.retrofit.response.mealdata

import com.google.gson.annotations.SerializedName

data class Row (
    @SerializedName("ATPT_OFCDC_SC_CODE")
    val atptOfcdcScCode: String,

    @SerializedName("ATPT_OFCDC_SC_NM")
    val atptOfcdcScNm: String,

    @SerializedName("SD_SCHUL_CODE")
    val sdSchulCode: String,

    @SerializedName("SCHUL_NM")
    val schulNm: String,

    @SerializedName("MMEAL_SC_CODE")
    val mmealScCode: String,

    @SerializedName("MMEAL_SC_NM")
    val mmealScNm: String,

    @SerializedName("MLSV_YMD")
    val mlsvYmd: String,

    @SerializedName("MLSV_FGR")
    val mlsvFgr: String,

    @SerializedName("DDISH_NM")
    val ddishNm: String,

    @SerializedName("ORPLC_INFO")
    val orplcInfo: String,

    @SerializedName("CAL_INFO")
    val calInfo: String,

    @SerializedName("NTR_INFO")
    val ntrInfo: String,

    @SerializedName("MLSV_FROM_YMD")
    val mlsvFromYmd: String,

    @SerializedName("MLSV_TO_YMD")
    val mlsvToYmd: String
)