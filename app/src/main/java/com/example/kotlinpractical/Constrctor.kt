
fun main() {

    var car= MyCar("1st Car","Rolls Royal ")
    var car1= MyCar("1","2")

}

class MyCar(var mcarname:String,var mcareTest:String,var namess:String,var prices:String) {

    init {
        mcarname="TEST"
    }


    constructor(carname :String, careTest :String): this (carname, careTest, "12121", "23424")

}


