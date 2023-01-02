package com.example.kotlinpractical
fun main() {

    // Poly means Many and Morph means Form
    // Parent can hold reference to its child class
    // Parent can call methods of child class WHICH ARE COMMON

    val shape =Shape1()

    printArea(shape)

    val square1=Square1(4.0)
    printArea(square1)
}

 fun printArea (shape:Shape1) {
    println(shape.area())
}

open class Shape1 {
    open fun area () = 0.0
}

class Circle1(val radius :Double) :Shape1() {

    override fun area():Double=Math.PI * radius * radius
}

class Square1(val side :Double) :Shape1() {
        override fun area():Double= side * side
}

class Traingle1 (val base:Double,val height:Double): Shape1(){

        override fun area():Double= 0.5 * base * height
}