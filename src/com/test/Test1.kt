package com.test

fun main(agrs:Array<String>){
    foo()
}
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value1: Int) {
        if (value1 == 3) return  // 局部返回到匿名函数的调用者，即 forEach 循环
        print(value1)
    })
    print(" done with anonymous function")
}