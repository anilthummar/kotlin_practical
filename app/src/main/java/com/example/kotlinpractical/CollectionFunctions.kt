package com.example.kotlinpractical

fun main() {
//filter 1 true/false,2true/false  ,3true/false , 4 true/false
    val nums= listOf<Int>(1,2,3,4,5)
    println(isOdEvent(2))
    println(isOdEvent(5))

    val list =nums.filter (::isOdEvent)
    println(list)

    val list1 = nums.filter(fun(a:Int):Boolean{
        return a%2 !=0
    })
    println(list1)


val userlist = listOf<User>(
    User(1,"A"),
    User(2,"B"),
    User(3,"C"),
    User(4,"D")
)

  println(  userlist.filter { it.id==2 })

    val paidUser=userlist.map {
        PaidUser(it.id,it.name,"Paid")
    }

    println("paidUser: "+paidUser)


    // Map Function - one form to another form  convert
    //Map function convert one one item into another list

    val listMap=nums.map { it * it }
    println("listMap: "+listMap)


    //forEach
    for (i in nums){
        println("forEach "+i)
    }

    nums.forEach{
        println("nums.forEach : "+it)
    }



}

fun isOdEvent(a:Int):Boolean{
    return a % 2 != 0
}

data class User(val id:Int, val name:String){

}

data class PaidUser(val id:Int, val name:String, val type :String){

}



