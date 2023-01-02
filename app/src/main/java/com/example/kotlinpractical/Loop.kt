fun main() {
    var count= 5;
    var index=1

    while (index <=10) {

        println(count * index)
        index++
    }

    var index1= 5

    do {
        println("Kotlin ")
        index1++
    }while (index1<=5)

    for (i in 0..5 step 1){
        println(i)
    }
    println("-----------")

    for (i in 1 until 5){
        //println(i)
    }

    for (i in 10 downTo  1 step 2){
        println("Down "+ i)
    }

}