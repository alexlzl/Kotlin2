package com.test

/**
 * 在 Java 平台数字是物理存储为 JVM 的原生类型，除非我们需要一个可空的引用（如 Int?）或泛型。 后者情况下会把数字装箱。
 */
fun main(args :Array<String>){

}
//  注意数字装箱不一定保留同一性:
fun test1(){
    val a: Int = 10000
    println(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
}
//另一方面，它保留了相等性:
fun test2(){

}