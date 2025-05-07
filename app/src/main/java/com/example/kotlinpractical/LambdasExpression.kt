package com.example.kotlinpractical

import kotlin.math.pow

fun main() {

    // Lamada expression - ananimous fun , no name of fun

    println(sum(2.0,3.0))
    println(power(2.0,3.0))


    // fun data type , store this fun in variable
    var fn:(a : Double, b :Double)-> Double=::sum

    println(fn(4.0,5.0,))

    val landa1={ x:Int, y:Int-> x+y }
    val multilineLamda={
        println("multilamda")

        val a =2+3
        "Hello Cheezycode "
        2
    //last type is return type

    }


    val singlelamda={x:Int -> x * x}
    val lamda3 : (Int)->Int={x-> x*x }


println(    multilineLamda()
)
}


fun sum(a:Double ,b :Double):Double{
    return a+b
}

fun power(a:Double ,b :Double):Double{
    return a.pow(b)
}
