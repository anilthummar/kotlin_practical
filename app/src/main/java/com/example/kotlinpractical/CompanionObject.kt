package com.example.kotlinpractical

fun main() {
    //Companion Object keyword
    // In class only 1 Companion object allowed per class

     MyClass.MyObject.f()

    MyClass.f()    //Companion Object its not static its creating object of class and access method

    MyClass.MyObject2.g()



}



class  MyClass {

    // singleton object
   companion object  MyObject {

        @JvmStatic
        fun f()= println("i am from f method")

    }

    object  MyObject2 {

        fun g()= println("i am from g method")

    }
}