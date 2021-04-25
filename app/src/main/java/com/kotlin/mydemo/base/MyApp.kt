package com.kotlin.mydemo.base

import android.app.Application
import com.kotlin.mydemo.api.ServiceApi

class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()
        BaseApi.baseUrl = "http://api.qizhongy.com/"
    }
}