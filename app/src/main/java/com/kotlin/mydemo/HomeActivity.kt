package com.kotlin.mydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.kotlin.mydemo.base.BaseActivity
import com.kotlin.mydemo.databinding.ActivityHomeBinding
import com.kotlin.mydemo.net.Repository
import com.kotlin.mydemo.vm.HomeViewModel

/**
 * 继承至BaseActivity基类
 */
class HomeActivity : BaseActivity<HomeViewModel,ActivityHomeBinding>(R.layout.activity_home,HomeViewModel::class.java),ClickEvt {

    override fun initView(){
        mViewModel.resultType.observe(this,{
            when(it){
                0 -> {
                    Log.i("TAG","it $it")
                    finish()
                }
                1 -> {
                    Log.i("TAG","it $it")
                }
            }
        })


    }


    override fun clickListener(v:View){
        when(v.id){
            R.id.btn_login -> {
                mViewModel.login()
            }
        }
    }

    override fun initVM() {

    }

    override fun initData() {
        mViewModel.getDetail()
    }

    override fun initVariable() {
        mDataBinding!!.clickEvt = this
        mDataBinding!!.homeVM = mViewModel
    }
}