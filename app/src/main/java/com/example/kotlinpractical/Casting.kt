package com.example.kotlinpractical

import java.util.*

fun main() {

    // run time checking type
    // is Operator to check type checking

    // compile time checking
    val circleCasting =CircleCasting(4.0)
    val playerCasting =PlayerCasting("Test")



//    val arr = arrayOf(circleCasting,playerCasting,Test()) //( obje as PlayerCasting) Test cannot be cast to class com.example.kotlinpractical.PlayerCasting
    val arr = arrayOf(circleCasting,playerCasting) // its will cast
    for(obje in arr){
        if(obje is CircleCasting){ // its smart cast
            println(obje.area())
        }else{
            // manual cast
            println(( obje as PlayerCasting).myname())
        }
    }

    if(circleCasting is CircleCasting){
        println("this is circle")
    }
}

 fun dragObjects(objects: Array<DraggableInterface>){
    for (obj in objects){
        obj.drag()
    }
}


interface  DraggableInterface{

    fun drag() // its be default abstract method
}

abstract class ShapeCasting : DraggableInterface{

    abstract fun area () : Double // by default its open
    // you can add body when fun is abstract

}


class CircleCasting(val radius :Double) :ShapeCasting() {
    override fun area():Double{
    return  Math.PI * radius * radius
    }

    override fun drag() = println("CircleInterface is dragging")
}

class  PlayerCasting(val name:String) :DraggableInterface{
    override fun drag()= println("$name is dragging")
     fun myname()= println("my name is playerclass method")

}


class  Test{

}



