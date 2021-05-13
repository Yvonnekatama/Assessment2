import java.awt.Color

fun main(){
  stringLength("Yvonne")
    var currentAccount=CurrentAccount(14568,"Katama",3456.90)
    println(currentAccount.deposit(15000.00))
    println(currentAccount.withdraw(4000.0))
    currentAccount.details()

}
data class Car(var make:String,var model:String,var color:String)
fun colorList(Car:List<Car>):Car{
    var red= mutableListOf<Car>()
    var blue= mutableListOf<Car>()
    var other= mutableListOf<Car>()

    when (color){

            "red"->println(red.plus(make))
            "blue"->println(blue.plus(model))
            "other"->println(other.plus(model))
        }

}




fun stringLength(city:String):Int {
    return city.length
}

class CurrentAccount( var accNumber:Int, var accName:String,var balance:Double){
    fun deposit(amount:Double):Double{
        balance+amount

        return balance
    }
    fun withdraw(amount:Double):Double{
        balance-amount

        return balance
    }
    fun details(){
        println("Account number $accNumber with balance $balance is operated by $accName")
    }

}

class SavingAccount(accNumber: Int,balance: Double,accName: String,withdrwals:Int):CurrentAccount{
    fun bankTrack():Int{
        if(withdrawals<4){

        }
    }
}


