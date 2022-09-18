package PracticeActivities


fun main(){

    var phone = SmartPhone()
    var features = arrayListOf("Battery Percentage", "Load Info")
    var functions = arrayListOf("Buy Load", "Battery Status", "Check Balance", "Call")

    println("Phone Selected Features:")
    println("*****************************")
    println(features)
    println()

    println("Phone Functions:")
    println("*****************************")
    println(functions)
    println()

    print("Select Actions:")
    var selectedaction = readln()
    if (selectedaction == features[0]){
        phone.ChargeBattery()
    }

    else if (selectedaction == features[1]){
        phone.CheckBalance()
    }

    else if (selectedaction == functions[0]){
        phone.ReturnLoad()
    }

    else if (selectedaction == functions[1]){
        phone.ChargeBattery()
    }

    else if (selectedaction == functions[2]){
        println("Total Balance is ${phone.spLoad}")
    }

    else if (selectedaction == functions[3]){
        phone.Call()
    }


}


//create a class called SmartPhone
class SmartPhone {

    val numberofcalls = 0
    val call: Int = 8
    var callminutes = 8 * (numberofcalls)


    var spBatteryPercentage: Int = 100
        get() = field
        set(value) {
            if (value >= 1) {
                println("Low Battery")
            } else if (value > 100) {
                println("invalid")
            } else if (value < 0) {
                println("Invalid")
            } else {
                println("Full Charged")
                field = value
            }

        }
    val loadbalance = 0
    var spLoad: Double = 0.00
        get() = field
        set(value) {
            if (value < 0) {
                println("invalid load")
            } else if (value == 0.00) {
                println("Check Operator Services")
            } else {
                field = value
            }
        }

    fun ReturnLoad() {//does not accept 0 or negative values
        print("Enter an amount you want to load:")
        var loadamount: Double = readln().toDouble()
        val totalamount = spLoad + loadamount
        println("Your Balance is now: $totalamount")
        val loadbalance = totalamount
        return

    }

    fun ChargeBattery() {//does not accept 0, negative values or should not exceed 100%
        println("Battery is ${this.spBatteryPercentage}%")
    }

    fun CheckBalance() {//display current load, if zero, display "Check Operator Services"
        println(this.spLoad)
        return
    }

    fun Call() {//8 load per minute, will not push tru if no sufficient load
        print("Type the phone number:")
        var phonenumber: Int = readln().toInt()
        if (spLoad >= 10) {
            println("Call Connected")
            return
        } else if (spLoad >= 7) {
            println("Insufficient Balance. You only have $spLoad load balance. Please reload.")
            return
        }
    }
}

