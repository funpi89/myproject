package com.a0922

fun main(args: Array<String>) {
    //println("Hellp kotlin")
    //Human().hello()
    val h = Human()
    h.hello()

    var  age = 19
    age.plus(1)
    val weight = 65.5
    val enroll = true
    println(age)
}
class Human {
    fun hello(){
        println("hello kotlin")
    }
}