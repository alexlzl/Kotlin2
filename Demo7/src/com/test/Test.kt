package com.test

fun demo() {
    val list = mutableListOf<String>()
    list.add("s1")
    list.add("s2")
    reportInfo(list)
}

fun reportInfo(info: MutableList<*>) {
    //不能add，赋值报错
    //info[1] = "s0"

    //可以get
    println(info[1])
    print(info)
}


fun main(args: Array<String>) {
    demo()
    println("")
}
