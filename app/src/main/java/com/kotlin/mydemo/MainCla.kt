package com.kotlin.mydemo

class MainCla:AbstractCla() {

    var name:String = "MainCla"

    override fun showTips(tips: String) {

    }

    fun checkInterface(view:IView){

    }

    /**
     * 嵌套的内部类  inner
     */
    inner class MyCla{
        fun getClassName(){
            println("class name $name")
            //匿名的内部类
            checkInterface(object : IView{
                override fun loadView() {

                }

            })
        }
    }






}