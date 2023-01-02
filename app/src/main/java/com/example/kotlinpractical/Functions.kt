fun main() {


    val mydata:Int= add(5,5)
    println(mydata)
    withoutreturntyp(15,6)
}



fun add(a:Int , b:Int):Int{
    return a+b
}
fun withoutreturntyp(a:Int , b:Int){
    var result= a+b
    println(result)
}