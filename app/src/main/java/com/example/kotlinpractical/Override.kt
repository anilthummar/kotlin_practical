fun main() {


    var t=Trend("me")
    var mMobile=Mobile("secondparam")

    t.getLanguage()
    mMobile.getLanguage()

}

open class  Mobile(var firstparam: String) {


    var varc ="c"
    var varcplus ="c++"
    var java="java"



    fun getLanguage(){
        println("Get all language  $firstparam")
    }
    open fun getMarket(){
        println("Get all language Markets ")
    }

}
class  Trend(firstparam: String) :Mobile(firstparam){

    override fun getMarket() {
        super.getMarket()
        super.getLanguage()

        println("getmarket call ")

    }


}