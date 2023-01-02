package com.example.kotlinpractical

fun main() {

    // Extension function
    // private member not access


    println("Hello Kotlin".formattedString())
}

// Extension function
fun String.formattedString():String{
    return "------\n$this\n------"
}