package com.example.kotlinpractical

fun main() {
    calculateTimeAndRun{
        loop(1000000)
    }
    // inline is keyword

}


// lamda create class
//  Creating class and instance and then return value
// create dynamic class, instance then use

fun calculateTimeAndRun(fn: ()->Unit){
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("Time taken ${end-start} ms")
}

fun loop(n:Long){

    for (i in 1..n){
        //
    }
}
