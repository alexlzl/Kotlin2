package com.test

class Test1 private constructor(val name :String,age :Int){

    constructor(a:Int) : this("",100) {

    }

}

class Test3 private constructor(age: Int){
   private constructor(string: String) : this() {

    }
    constructor() : this(100) {

    }
}

open class Base(p: Int,b:String)

class Derived(p: Int) : Base(p,""){

}