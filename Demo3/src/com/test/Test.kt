package com.test

class Test<T>(t:T){
    val t=t

}

fun main(args:Array<String>){
    println(Test<String>("alex").t)
    println(Test<Int>(100).t)
    val obj:String=Test("aaaaa").t
    println(obj)
}