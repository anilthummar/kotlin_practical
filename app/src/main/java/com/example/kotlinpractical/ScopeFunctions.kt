package com.example.kotlinpractical

fun main() {

    val emp=Employee()
    emp.age=20
    emp.name="A"

    // apply this is point to object
    // this is object and it points
    // and its retun it emp
    emp.apply {

        age=30
        name="T"
    }



    // let  it object retun
    // it return last value

    println(emp.age)
    println(emp.name)

    emp.let {
        println(it.name)
        println(it.age)
        "hello"
        23
    }

    val emp2:Employee= Employee()
    emp2?.age=20
    emp2?.name="D"


    emp2?.let {
        it.age=20
        it.name="TEst"
    }

    // normal fun this points
    // return value last statment

    with(emp2){
        age=30
        name="GF"
    }



    emp.run {
        age=35
        name="AA"
    }

}


data class Employee(var name:String="", var age :Int =18) {

}