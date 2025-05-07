package com.example.kotlinpractical

fun main() {
    //Enum - constant  value use  value is instnace
    // instance value we can't changed
   // Ex, Set of constant value to use  Sun to Mon value fixe
    // ex ,Gender

    val day=Day.SUNDAY
    println(day)
    println(day.number)

    for(i in Day.values()){
        println(i)
    }

    day.printFormattedDay()




    //Sealed
    // Sealed class cover all option

    val tile = Red("Mushrrom", 2)
    val tile2 = Red("Mushrrom", 2)

    println(tile.points)
    println(tile2.type)

    val tile3:Tile=Red("Mushrrom", 2)

    val  points :Int= when(tile3){  // Sealed class cover all option
        is Blue -> tile3.points * 2
        is Red -> tile3.points * 5
    }

    println(points)
}
enum class Day(val number :Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay(){
        println("Day is $this")
    }


}

//Sealed set of  type restrict
// multiple object create


sealed class Tile
class Red(val type:String,val points :Int):Tile()
class Blue(val points :Int):Tile()
