package com.example.kotlinpractical

fun main() {

    val objeChild = Child() // While creating object of class Compiler empty constructor call
    objeChild.myMethod()
//    objeChild.myMethod2()

}

// code Re Usability
// open use for compiler know for use class uisng Open keyword  Class A:B()
//cannot inherit from multiple classes only single inheritance call
// First PArent class constructor call then child class constructor call

open class Parent {
    init {
        println("Parent's constructor is call ")
    }
    val name: String=""
    fun myMethod(){
        println(" i am in Parent ")
    }
}


class  Child :Parent(){

    init {
        println("Child's constructor is call ")
    }
    val name2 :String =""
    fun myMethod2(){
        println(" i am in Child ")
    }
}