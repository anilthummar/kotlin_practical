package com.example.kotlinpractical

import com.example.kotlinpractical.PizzaFactory.Factory.create


fun main() {

    var pizzaFactory1 :PizzaFactory=PizzaFactory.Factory.create("Pappy Paneer")
    println(pizzaFactory1)

    var pizzaFactory2 =PizzaFactory.create("Pappy Paneer")
    println(pizzaFactory2)
}

//Example if factory pattern using companion object


class PizzaFactory (val type:String, val topping :String) {

     companion object Factory{ // this my factory object

        fun create(pizzaType:String) : PizzaFactory{

            return when (pizzaType){
                "Tomato" -> PizzaFactory("Tomato","Tomato Cheese")
                "Pappy Paneer" -> PizzaFactory("Paneer Farm","Paneer Cheese")
                else ->  PizzaFactory("Basic ","BasicCheese")
             }
        }
    }
}