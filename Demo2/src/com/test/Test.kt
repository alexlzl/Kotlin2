package com.test

class Test {
    private var name = "alex"
    var aa = "tim"
        private set
//        private get
    var setterVisibility: String = "abc"
        private set // 此 setter 是私有的并且有默认实现

}

fun main(args: Array<String>) {
    println(Test().aa)
}