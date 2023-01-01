package com.example.kotlinpractical

fun main() {

    // Poly means Many and Morph means Form
    


    // Parent can hold reference to its child class
    // Parent can call methods of child class WHICH ARE COMMON

    val mCircle :Shape = Circle(4.0) // Circle is child class and Reference shape class

    val mSquare :Shape = Square(4.0)

    // Based on Object Which method call at run time its decide

    //this method override
    println("" +mCircle.area()) // method call child class but Reference is shape class
    println("" +mSquare.area())


    val shapes: Array<Shape> = arrayOf(
        Circle(3.0),
        Traingle(3.0 ,4.0),
        Square( 4.0)
    )

    calculateArea(shapes)

}

 fun calculateArea (shape: Array<Shape>){
    for(shape in shape){
        println(": "+shape.area())
    }
}

open class Shape {
    open fun area () : Double{
        return  0.0
    }
}

class Circle(val radius :Double) :Shape() {

    override fun area():Double{
    return  Math.PI * radius * radius
    }
}

class Square(val side :Double) :Shape() {

    override fun area():Double{
        return  side * side
    }
}

class Traingle (val base:Double,val height:Double): Shape(){


    override fun area(): Double {
        return 0.5 * base * height
    }
}