package com.test

/**
 * 幕后属性
 *
 * 这里size是提供给对外的变量，_size是内部使用的，其实最后还是通过函数来控制的
 * 这里_size就叫做幕后属性
 其实幕后属性就是我们设计类属性时的一种实现方法而已
 不同于field幕后字段是Kotlin内置提供给我们的
 */
class Demo {
    val size get() = _size
    private var _size: Int = 0
}