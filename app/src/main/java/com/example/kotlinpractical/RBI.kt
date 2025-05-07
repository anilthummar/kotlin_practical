fun  main() {

//    var SBIcall= SBI()
//    SBIcall.rateis("SBI",10000, 6)
//
//
//    var SBI = SBI()
//
//    SBI.extentionfun().replace("A","D")


}



class  myconstrct(var strname:String){



    init {
        System.out.println("strname : " +strname)
    }

    fun show(){

        System.out.println("show: ")
    }


}
open class RBI() {

     companion object{
        var rbirate:Int = 6

    }

    fun rateis(bank_name: String, amt: Int, odrate: Int){

        var totoalrate:Int=0

        if(odrate <= rbirate){
            totoalrate= rbirate

        }else{
            totoalrate= rbirate
        }
        System.out.println("SBI : " +amt)
    }
}









