package com.test

interface Foo {
    val count: Int
}

class Bar1(override val count: Int) : Foo
/**
 * 你也可以用一个 var 属性覆盖一个 val 属性，但反之则不行。
 * 这是允许的，因为一个 val 属性本质上声明了一个 getter 方法，
 * 而将其覆盖为 var 只是在子类中额外声明一个 setter 方法
 */
class Bar2 : Foo {
    override var count: Int = 0
}