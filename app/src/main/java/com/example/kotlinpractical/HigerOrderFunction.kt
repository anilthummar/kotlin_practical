package com.example.kotlinpractical

fun main() {

//HigerOrderFunction -  in input get fun or ouput pass fun  or both
    //

    var fn:(a:Double,b:Double)->Double=::sum1
    println(fn(2.0,4.0))
    calculator1(5.0,6.0,::sum1)

}
fun sum1(a:Double,b:Double):Double{
    return a+b
}
fun calculator1(a:Double,b:Double, gn1:(Double,Double)->Double){

    val result = gn1(a,b)

    println(result)
}