package com.test

fun <T> boxIn(value: T) = Box1(value)

// 以下都是合法语句
val box4 = boxIn<Int>(1)
val box5 = boxIn(1)
class  Box1<T>(t:T){

}