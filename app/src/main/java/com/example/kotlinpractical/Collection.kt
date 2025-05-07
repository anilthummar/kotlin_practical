package com.example.kotlinpractical

fun main() {


    // List - creating list
    // Mutable list and un mutable list
    //Mutable list - can be changed , element can be added,remove,replace
    //in mutable list - can be changed


    val nums= listOf<Int>(1,3,5)
    println(nums.indexOf(3)) // o/p = 0
    println(nums.contains(4)) // false


    val nums1= mutableListOf<Int>(1,3,5)
    nums1.add(5)
    nums1.remove(1)
    println(nums1)


    val list2= listOf<Int>(11,33)
    nums1.addAll(list2)
    println(nums1)




    // Maps key value pair
    //Ex - Std id (key ) must be uniqe and name(value)

    val student= mutableMapOf<Int,String>()
    student.put(1,"A")
    student.put(2,"B")
    student.put(3,"C")
    student.put(4,"D")
    student.put(5,"E")

    println("mutableMapOf" +student)

        for ((key,value )in student){
            println("$key = $value")
    }

    student[8]="T"
    println(student[8])



    val map = mapOf<Int,String>(1 to "a",
    2 to "b")
    println("map : - "+map)




}

class Collection {
}