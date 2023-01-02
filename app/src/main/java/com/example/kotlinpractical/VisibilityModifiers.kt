package com.example.kotlinpractical

fun main() {

    // public  -> everywhere
    // internal -> Within module
    // private -> within file (encapsulation)
    // protected ->sub classes


    val objA=VisibilityModifiers()
    objA.p
    objA.q


    val objABCD=ABCD()
    objABCD.p
    objABCD.q
}
// be default fun  and class are public

// Public means every where you can access in fun,class

open class VisibilityModifiers {

     public  var p =10 //everywhere
    internal var q =20 // only Within module
    private var r =40  // only access in class
    protected var s =60  // only access with sub class

}


class  ABCD: VisibilityModifiers(){

    fun test(){
        println(p)
        println(q)
        //println(r) // only access in class
        println(s) // only access with sub class
    }
}

public  fun get(){

}


// internal only access in same module (within module)

internal  class  AB{

}


// Private only same class access

private  class ABC{

}


// Top level declaration protected is not use ,
//only use in class not in fun



