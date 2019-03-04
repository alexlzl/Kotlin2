package com.test

/**
 * 定义别名前的参数类型
 */
interface RestaurantPatron {
    fun makeReservation(restaurant: Organization<(String, String?) -> String>)
    fun visit(restaurant: Organization<(String, String?) -> String>)
    fun complainAbout(restaurant: Organization<(String, String?) -> String>)
}

class Organization<T>{

}
/**
 * 为泛型类定义别名
 */
typealias Restaurant = Organization<(String, String?) -> String>


interface RestaurantPatron1 {
    fun makeReservation(restaurant: Restaurant)
    fun visit(restaurant: Restaurant)
    fun complainAbout(restaurant: Restaurant)
}