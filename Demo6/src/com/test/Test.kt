package com.test


/**
 * 内部类
 * 类可以标记为 inner 以便能够访问外部类的成员。内部类会带有一个对外部类的对象的引用：
 */
class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo = Outer().Inner().foo() // == 1

/**
 * 类可以嵌套在其他类中：
 */
class Outer1 {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}

val demo1 = Outer1.Nested().foo() // == 2