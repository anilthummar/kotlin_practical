package com.example.kotlinpractical

fun main() {
    val objOnePlus =OnePlus("SmartPhone")

    objOnePlus.display()
    val objGeneralMobile =Mobile("General")

    objGeneralMobile.display()
    println(objOnePlus.toString())

     // Any Data type By default Ant Data Type
    // The root of the Kotlin class hierarchy. Every Kotlin class has Any as a superclass.
}

// code Re Usability
// open use for compiler know for use class uisng Open keyword  Class A:B()
//cannot inherit from multiple classes only single inheritance call
// First Parent class constructor call then child class constructor call

open class Mobile(val type :String) { // Parameterize constructors
    init {
        println("Mobile's init block is call ")
    }

    open val name: String=""
    open val size: Int=5
    fun makeCall() = println("Calling from Mobile") // its a single line function
    fun powerOff() = println("Shutting Down")// its a single line function

    // Use this method in my OnePlus class use open keyword for orverride fun in my one plus class
    open fun display() = println("Simple mobile display")
}

class  OnePlus(typeParam:String) :Mobile(typeParam){

    // using override keyword use override fun in my child class

    override fun display(){

        super.display() // call parent class method , call superclass
        println("One plus display")

    }

    override val name: String
        get() = "One Plus"

    override val size: Int
        get() =6

    override fun toString(): String {
        return "Name - $name - Size $size - $size"
    }
}