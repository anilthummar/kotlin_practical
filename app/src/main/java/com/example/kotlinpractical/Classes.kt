
fun main() {
    var count :Int=20


    println(count.div(2))

    var myCar=Car("Rolls Royal","Classic", "10")
    println(myCar.getPrice().toString() + myCar.getName())
}

class  Car(var name :String , var type :String , var price:String ){

    fun getPrice(){
     println(price.toInt() * 10)
    }

    fun getName(){
        println(name)
    }
}