package com.example.kotlinpractical

import java.util.*

fun main() {

    // common behaviour we can implement that interface
    // interface can have both abstract and concrete method
    // interface can implement other interface and one class can implement many interface but classes can have only super class

    // Group object based on what they can do rather than what they are
    // To user


    dragObjects(arrayOf(
        CircleInterface(4.0),
        SqaureInterface(4.0),
        TriangleInterface(3.0,4.0),
        Player("Test")
    ))
}

 fun dragObjects(objects: Array<Draggable>){
    for (obj in objects){
        obj.drag()
    }
}


interface  Draggable{

    fun drag() // its be default abstract method
}

abstract class ShapeInterface : Draggable{

    abstract fun area () : Double // by default its open
    // you can add body when fun is abstract

}


class CircleInterface(val radius :Double) :ShapeInterface() {
    override fun area():Double{
    return  Math.PI * radius * radius
    }

    override fun drag() = println("CircleInterface is dragging")
}

class SqaureInterface(val side :Double) :ShapeInterface() {
    override fun area():Double{
        return  side * side
    }

    override fun drag() = println("SqaureInterface is dragging")
}

class TriangleInterface(val base :Double,val height :Double) :ShapeInterface() {
    override fun area():Double{
        return  0.5* base * height
    }

    override fun drag() = println("TriangleInterface is dragging")
}

class  Player(val name:String) :Draggable{
    override fun drag()= println("$name is dragging")

}
