package Exercises
//Implement Activity 02 - A using Classes.
//Create an application that will accept monetary amounts. The application will continue to accept values until a “No” is set as input.
fun main(){

    var monetaryamounts = MonetaryValue()

    do {
        println("Do you want to add another amount?")
        var answer = readln().lowercase()

        if (answer == "yes"){
            monetaryamounts.sum()
        }

    }while (answer == "yes")

    monetaryamounts.dividedamount()
}

class MonetaryValue{

    var amount1: Double = 0.00
    var sum: Double = 0.00

    init {
        print("Enter Amount:")
        var amount : Double = readln().toDouble()

        amount1 = amount
        println("Amount is $amount")
    }
    fun sum(){
        print("Enter another Amount:")
        var amount2: Double = readln().toDouble()

        amount1 = amount1 + amount2
        sum = amount1
        println("Total amount is : $amount1")
    }
    fun dividedamount(){
        print("Divided the value by how many?")
        var valueamount: Int = readln().toInt()

        print("Divided Total Amount is ")
        println(sum / valueamount)
    }
}
