package Exercises

import kotlin.system.exitProcess

fun main() {

    var answer: String = "Yes"

    do {
        print("Enter Amount:")
        var amount1: Double = readln().toDouble()

        val totalamount = amount1
        println("Total amount is $totalamount")

        println("Do you want to add another amount?")
        answer = readln()

        if (answer == "No") {
            print("Divided the value by how many?")
            var valueamount: Int = readln().toInt()
            print("Divided Total Amount is ")
            println(totalamount / valueamount)
        }


    } while (answer == "Yes")
   return check(error(exitProcess(status = 0)))
}




