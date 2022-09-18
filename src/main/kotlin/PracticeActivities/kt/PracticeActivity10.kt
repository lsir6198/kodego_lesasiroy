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
        println("Total Balance is ${phone.loadbalance}")
    }

    else if (selectedaction == functions[0]){
        phone.ReturnLoad()
    }

    else if (selectedaction == functions[1]){
        phone.ChargeBattery()
    }

    else if (selectedaction == functions[2]){
        phone.CheckBalance()
    }

    else if (selectedaction == functions[3]){
        phone.Call()
    }


}


//create a class called SmartPhone
class SmartPhone {

    var loadbalance = 0

    init {
        println("Smart Phone System")
        println("Remaining Balance: $loadbalance")
    }

    fun ReturnLoad() {//does not accept 0 or negative values
        print("Enter an amount you want to load:")
        var loadamount: Double = readln().toDouble()
        if (loadamount <= 0) {
            println("Invalid amount")
            ReturnLoad()
        }
        val totalamount = loadbalance + loadamount
        println("Your Balance is now: $totalamount")
    }

    fun ChargeBattery() {//does not accept 0, negative values or should not exceed 100%
        var spBatteryPercentage: Int = 200
        if (spBatteryPercentage <= 20 && (spBatteryPercentage >= 1)){
            println("Low Battery")
        }
        else if (spBatteryPercentage <= 0) {
            println("invalid input: $spBatteryPercentage")
        }
        else if (spBatteryPercentage > 100) {
            println("INVALID input: $spBatteryPercentage")
        }
        else{
            println("Battery is $spBatteryPercentage%")
        }
    }

    fun CheckBalance() {//display current load, if zero, display "Check Operator Services"
        if (loadbalance == 0){
            println("Check Operator Services")
        }
        else {
            println("Remaining Balance is $loadbalance")
        }
    }

    fun Call() {//8 load per minute, will not push tru if no sufficient load
            print("Dial the phone number:")
            var phonenumber: Double = readln().toDouble()

            if (loadbalance <= 7 && (loadbalance >= 0)) {
                println("Insufficient Load")
                println("Call Failed")
                println("Remaining Balance: $loadbalance")
            }
            else if (loadbalance < 0) {
                println("invalid")
            }
            else if (loadbalance >= 8) {
                println("Call Connected")
                print("Call Minutes:")
                var callminutes: Int = readln().toInt()
                var remainingbalance = callminutes * 8
                var loadbalance = loadbalance - remainingbalance
                println("Remaining Balance is $loadbalance")
            }
    }
}


