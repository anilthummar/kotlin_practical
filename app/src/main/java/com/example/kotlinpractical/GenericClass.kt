package com.example.kotlinpractical

fun main() {

    //GenericClass same class container use for type pass in class

    // type depanand and its generica class

    // list and map are generica class

    val obj=IntContainer(3)
    obj.getValue()

    val  intContainer= IContainer(3)
    intContainer.getValue()

    val  sntContainer= IContainer("Test")
    sntContainer.getValue()

    val list = listOf<String>()


    // vararg multiple argu pass
    add(1,3,4,5,6,6,7)
    add(1,1,1,1,1,1,1,1,1)
}


fun add(vararg  values:Int){
    var sum=0
    for (i in values){
        sum += i
    }

    println(sum)
}

class IContainer<T>(var data:T) {

    fun setValue(value :T){
        data=value
    }

    fun getValue():T{
        return data
    }
}



class IntContainer(var data:Int) {
    fun setValue(value :Int){
        data=value
    }

    fun getValue():Int{
        return data
    }
}


class StringContainer(var data:String) {
    fun setValue(value :String){
        data=value
    }

    fun getValue():String{
        return data
    }
}