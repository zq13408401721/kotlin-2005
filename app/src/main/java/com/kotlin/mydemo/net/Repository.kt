package com.kotlin.mydemo.net

import com.kotlin.mydemo.api.ServiceApi
import com.kotlin.mydemo.base.BaseRepository
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.Disposables
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository:BaseRepository<ServiceApi>(ServiceApi::class.java) {

    /**
     * 获取详情数据的的接口
     */
    suspend fun getDetail(id:Int) = withContext(Dispatchers.IO){
        api!!.getDetail(id)
    }

}