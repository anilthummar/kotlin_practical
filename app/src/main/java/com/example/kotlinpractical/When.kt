fun main() {
    val number =5

    val result=number in 0..5   // 1,2,3,4,5
    println(result)


    val result1=number in 0 until 5   // 1,2,3,4
    println(result1)


    val num="5"



    val resultWhen =when(num){
        "1" -> println("1")
        "2" -> println("2")
        "5" -> println("5")
        else->println("num not found")
    
    }

//    when(num){
//        "1" -> println("1")
//        "2" -> println("2")
//        "5" -> println("5")
//        else->println("num not found")
//
//    }

println(resultWhen)



}