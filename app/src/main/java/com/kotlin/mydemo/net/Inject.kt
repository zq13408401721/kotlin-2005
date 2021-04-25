package com.kotlin.mydemo.net

object Inject {
    /**
     * 得到数据厂库的实例
     */
    val repository:Repository by lazy {
        Repository()
    }
}