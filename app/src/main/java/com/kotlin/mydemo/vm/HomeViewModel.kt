package com.kotlin.mydemo.vm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kotlin.mydemo.api.ServiceApi
import com.kotlin.mydemo.base.BaseViewModel
import com.kotlin.mydemo.data.DetailData
import com.kotlin.mydemo.net.Inject
import com.kotlin.mydemo.net.Repository
import kotlinx.coroutines.launch

/**
 * home页面的viewmodel
 */
class HomeViewModel:BaseViewModel<Repository>(Inject.repository) {

    var username:String = ""
    var pw:String = ""

    var resultType:MutableLiveData<Int> = MutableLiveData()   //当这个值为0 成功 1失败
    var detailData:MutableLiveData<DetailData> = MutableLiveData()  //初始化数据

    var id:Int = 6434

    /**
     * 详情数据的获取
     */
    fun getDetail(){
        viewModelScope.launch {
            var result = repository.getDetail(id)
            if(result.ret == 0){
                detailData.postValue(result)
            }
        }
    }


    fun login(){
        if(username.isNotEmpty() && pw.isNotEmpty()){
            // 网络请求
            Log.i("TAG","login：username $username,pw $pw")

            resultType.postValue(0)

        }
    }

}