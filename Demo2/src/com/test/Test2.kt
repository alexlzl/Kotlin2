package com.test

class Person(val name:String){
    val nameHash:Int
        get() {
//            field = 5
            return 10
        }
    fun out(){
        println(nameHash)
    }
}
fun main(args: Array<String>) {

    val ts = Person("lxx")
    println(ts.nameHash)
    ts.out()
}

