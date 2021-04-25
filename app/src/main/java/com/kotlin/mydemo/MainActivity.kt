package com.kotlin.mydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.google.android.material.button.MaterialButton
import com.kotlin.mydemo.data.ImgData
import com.kotlin.mydemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //初始化页面的UI
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        initView()
    }

    private fun initView() {
        var imgData = ImgData("https://img-baofun.zhhainiao.com/pcwallpaper_ugc/live/2cd0e8ee8b120d5b579878915ac99222.mp4.jpg",1)
        //binding!!.setVariable(BR.imgData,imgData)
        binding!!.imgData = imgData
        binding!!.clickEvt = this
    }

    fun login(){
        Log.i("TAG","login")
    }

    fun register(){
        Log.i("TAG","register")
    }

    /**
     * 所有的点击事件归总
     */
    fun click(v:View){
        if(v is TextView){
            Log.i("TAG","click is TextView")
        }else if(v is Button){
            Log.i("TAG","click is Button")
        }
        when(v.id){
            R.id.btn_login -> {
                Log.i("TAG","click login")
            }
            R.id.btn_register -> {
                Log.i("TAG","click register")
            }
            R.id.txt_username -> {
                Log.i("TAG","click username")
            }
        }
    }
}