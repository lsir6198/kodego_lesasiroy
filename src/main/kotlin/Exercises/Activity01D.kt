package Exercises

import kotlin.system.exitProcess

fun main() {

    var quotient: Double = 0.00
    var answer: String = "Yes"


    print("Enter Amount:")
    var amount1 : Double = readln().toDouble()

        do {
            println("Do you want to add another amount?")
            answer = readln()

            if (answer == "Yes") {
                print("Enter another Amount:")
                var amount2: Double = readln().toDouble()
                var totalamount = amount1 + amount2 + amount2
                quotient = totalamount
                println("Total amount is : $totalamount")
            }


        }while (answer == "Yes")

        print("Divided the value by how many?")
        var valueamount: Int = readln().toInt()

        print("Divided Total Amount is ")
        println(quotient / valueamount)

   return check(error(exitProcess(status = 0)))
}




