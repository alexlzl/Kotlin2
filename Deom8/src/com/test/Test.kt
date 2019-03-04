package com.test

class A {
    inner class Inner{
     public   fun test(){
            println("=========")
        }
    }
}
class B {
    inner class Inner
}

typealias AInner = A.Inner
typealias BInner = B.Inner

fun main(args:Array<String>){
   val obj=A().Inner()
    val obj1=A().AInner()
    obj1.test()
}