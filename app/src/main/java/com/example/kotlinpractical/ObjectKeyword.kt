package com.example.kotlinpractical

fun main() {

    // Object KEyword
    // Class and Single Object crated at Once
    // Object declaration -> no constructor allowed
    // init block is allowed
    // Singleton pattern
    // you can inherit class / interface


    //Singleton pattern
    // Only 1 object create
    // Ex ,DB ,Logger


    println(mObject.num)
    mObject2.test()


    SharingWidghet.incrementTwitterLikes()
    SharingWidghet.incrementTwitterLikes()
    SharingWidghet.incrementTwitterLikes()
    SharingWidghet.incrementFBLikes()
    SharingWidghet.display()



    //Object Expression
    // Anonymous object using object keyword
    // Replacement of javas anonymous inner class

    // only 1 object and kotlin create only 1 object
    var testObj=object{
        val x:Int=100
        fun method(){
            println("i am object Expression")
        }
    }

    println(testObj.method())

    //Ex -> Object Expression anonymous object

    var myanonymousObj =object : Clonable {
        override fun clone() {
            println("i am clone")
        }

    }


    var myanonymousObj2= object : Person("P1") {

        override fun fullname() {
            super.fullname()
            println("Anonymous - $name")
        }
    }

    myanonymousObj2.fullname()


}
object mObject{

    val num :Int=10

}

open  class  Person(val name:String){

    open  fun fullname()= println("Full name - $name")
}

object mObject2{

    val num2 :Int=10

    fun test(){
        println("mObject2 $num2")
    }
}


// Ex. Like (count) from Fb,google,inst,twitter,etc

object  SharingWidghet{
    private var twitterlike=0
    private var fblike=0


    fun incrementTwitterLikes()= twitterlike++
    fun incrementFBLikes()= fblike++

    fun display()= println("" +
            "Facebook - $fblike -- Twitter - $twitterlike")

}


//Object Expression

interface  Clonable{
    fun  clone(){

    }

}


