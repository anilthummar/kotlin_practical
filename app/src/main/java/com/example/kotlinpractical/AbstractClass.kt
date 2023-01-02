package com.example.kotlinpractical

fun main() {

    // can not be instantiaed
    //Abstract class can have both abstract and non abstract properties & methods
    // if class have abstract method or property then class must be declared as abstract


    val circleAbstract = CircleAbstract(4.0)
    println(circleAbstract.area())
    circleAbstract.display()
}

abstract  class  A{
    fun mydata1(){
        println("i am my data 1")
    }

}



abstract class ShapeAbstract {
    var name:String=""
    abstract fun area () : Double // by default its open

    // you can add body when fun is abstract
    abstract fun display() // this fun must have to implement in child class
}

class CircleAbstract(val radius :Double) :ShapeAbstract() {

    override fun area():Double{
    return  Math.PI * radius * radius
    }

    override fun display() {
        println("CircleAbstract getting displayed ")
    }
}

