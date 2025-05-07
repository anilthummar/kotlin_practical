package com.example.kotlinpractical

fun main() {

    //Data classes for getter and setter our data
    // its hold our data and by default its creating hash code , component-1,2 , copy fun




    val p1=PersonData(1,"p1")
    val p2=PersonData(1,"p1")


    println(p1.toString()) // toString is from Any Class Main Class
    println(p2)
    println(p1.hashCode()) // use for collection
    println(p1== p2) // checking address  p1.equals(p2)

    val p3 =p1.copy(id=3) // creating object on copy
    println(p3)


    // de structuring
    val (id:Int ,name:String)=p1
    println(id)
    println(name)

}
  data class PersonData(val id:Int, val name:String) // this is primary constructor
  {

  }