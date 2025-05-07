package com.example.kotlinpractical

import java.lang.IllegalArgumentException
import java.lang.NullPointerException


fun main() {


    // some of the Error we can't handle - jvm error,ram,
    // DB connection we can handle
    //Enter number in age field



    val arr= arrayOf(1,2,3)

    try{
        println(arr[5]) //Exception generate
    }
    catch (ex:NullPointerException){
        println("NullPointerException")
    }
    catch (e: Exception){
        println("Please check the array of index")
    }

    finally {
        //this block execute any how if error come or not
        println("finally block execute")
    }


    try {

    }catch (e:Exception){

    }


    try {

    }finally {

    }



    createUSerList(-3)


}

fun createUSerList(count:Int){
    if (count<0){
        // Exception
        throw IllegalArgumentException("Count must be grater then zero")
    }else{
        println("user list created :$count")
    }
}