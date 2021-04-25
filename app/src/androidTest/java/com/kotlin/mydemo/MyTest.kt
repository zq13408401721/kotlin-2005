package com.kotlin.mydemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MyTest {

    @Test
    fun Test_Main(){
        println("hello kotlin")
        testLambda()

        println("不定参数输出结果："+myNumber(1,2,4,5,6,7))
        testStr()
        saveValue(1,"abc")
        saveValue("H","xyz")
        saveValue(2.0f,"mn")
        testRange()
        testCla()
        testfor()
        testClass()
    }

    fun testLambda(){
        var myFun:(Int,Int) -> Int = {a,b -> a+b}
        println("result:"+myFun(1,2))
        println("result:"+myFun1(1,2))
    }

    fun myFun1(a:Int,b:Int):Int {
        return a+b
    }

    fun myNumber(vararg num:Int):Int{
        var value:Int=0
        for (v in num){
            value+=v
        }
        return value
    }

    fun testStr(){
        var num = 10
        var str = "this apple is $num"
        println(str)

        var name:String?="123"
        name!!.toInt()
    }

    fun saveValue(key:Any,value:String){
        if(key is String){  // instanceof
            println("this key type is String,value is $value")
        }else if(key is Int){
            println("this key type is Int,value is $value")
        }else if(key is Float){
            println("this key type is Float,value is $value")
        }
    }

    fun testRange(){
        for (i in 0..10) println("for i is $i")
    }

    fun testCla(){
        var claA = ClaA("a",12)
        claA.save()
    }


    fun testType(type:Int){
        when(type){
            1 -> println("value is$type")
            2 -> println("value is$type")
            3 -> {
                println("value is $type")
                var num:Int = 0
            }
            else -> {
                println("默认执行条件")
            }
        }
    }

    fun getValueByType(type:Any) = when(type){
        is String -> {
            println("type is String")
        }
        else -> {
            println("type is Any")
        }
    }

    fun testfor(){
        var objs = listOf("a","b","c")
        for((index,item) in objs.withIndex()){
            println("list pos is $index,value is $item")
        }
        objs.forEach{
            println("foreach item $it")
        }
    }

    fun testDoubleFor(){
        loop@for(i in 0..10){
            for(j in 0..10){
                if(j == 1){
                    break@loop
                }
            }
        }
    }

    fun testClass(){
        var user = User("张三")
        user.UserPrint()

        Http.className
        Http.singleton.connect()
    }
}