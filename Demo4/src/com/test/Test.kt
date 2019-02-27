package com.test

// 定义一个支持协变的类
class Runoob<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

fun main(args: Array<String>) {
    var strCo: Runoob<String> = Runoob("a")
    var anyCo: Runoob<Any> = Runoob<Any>(100)
    anyCo = strCo
    println(anyCo.foo())   // 输出 a
}