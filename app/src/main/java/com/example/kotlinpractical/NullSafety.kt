package com.example.kotlinpractical

fun main() {


    //Non- Nullable variable
    var gender :String="Male" // Female , Others

    //String? its Nullable type
    //Nullable type  meas access null as well as value of variable

    var gender2: String? =null  // absence of value null safety

    var isAdult: Boolean? =true //null and true accepted



    if (gender2 != null) {
       println( gender2.toUpperCase())
    }

    //Safe Call ?. Check first object is null then its not call
   println( gender2?.toUpperCase())




    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2") // // Let using safe call (?.) // operator value always contain something
        println("Line 3 $it") // point it object
    }


    gender2.let {

    }

    // Elvis operator (?:) its check first gender2 null then value will be ="N/A" other wise
    // its contain gender2 value
    var selectedValue:String? =gender2 ?:"N/A"



    // Not null Assert option !!
    // assert object non-null fun call otherwise throw error
    var value =gender2!!.toUpperCase()


}

class NullSafety {
}