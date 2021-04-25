package com.kotlin.mydemo.api

import com.kotlin.mydemo.base.BaseApi
import com.kotlin.mydemo.data.DetailData
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ServiceApi:BaseApi{

    @POST("api/cms/detail")
    suspend fun getDetail(@Query("id") id:Int):DetailData


}