package com.kotlin.mydemo

open class ClaA(
    var name:String,
    var age:Int
):IView {


    fun save(){
        println("this name is $name,age is $age")
    }

    override fun loadView() {
        println("loadView方法执行")
    }
}