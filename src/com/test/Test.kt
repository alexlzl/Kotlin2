package com.test

fun main(args:Array<String>){
//    println(sum.invoke(1,2))
    val array= listOf("a","b","c")
    for ((value, index1) in array.withIndex()) {
        println("the element at $index1 is $value")
    }
}
val sum = fun(arg1 : Int, arg2 : Int) : Int{
    return arg1 + arg2
}

fun test(){
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers
    println(numbers)        // 输出 "[1, 2, 3]"
    numbers.add(4)
    println(readOnlyView)   // 输出 "[1, 2, 3, 4]"
//    readOnlyView.clear()    // -> 不能编译

    val strings = hashSetOf("a", "b", "c", "c")
    assert(strings.size == 3)
}

