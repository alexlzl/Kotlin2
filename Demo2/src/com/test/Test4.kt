package com.test


class Foo {
    lateinit var   lateinitVar: String
 var name="alex"
    fun initializationLogic() {
        println(this::name)
        //sampleStart
        println("isInitialized before assignment: " + this::lateinitVar.isInitialized)
        lateinitVar = "value"
        println("isInitialized after assignment: " + this::lateinitVar.isInitialized)
        //sampleEnd
    }
}

fun main(args: Array<String>) {
    Foo().initializationLogic()
}
