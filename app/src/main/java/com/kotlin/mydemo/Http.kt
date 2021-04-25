package com.kotlin.mydemo

class Http {


    /**
     * 伴生对象  等同 static
     */
    companion object{
        var className:String = "Http"
        var instance:Http? = null
            get() = Http()

        val singleton:Http by lazy { Http() }

        @JvmName("getInstance1")
        fun getInstance(){

        }
    }

    fun connect(){
        println("connect")
    }
}