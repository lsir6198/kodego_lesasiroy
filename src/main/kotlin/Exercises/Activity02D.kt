package Exercises
//Implement Activity 02 - A using Classes.
//Create an application that will accept monetary amounts. The application will continue to accept values until a “No” is set as input.
fun main(){
    var answer: String = "Yes"
    var monetaryamounts = Activity02D()


    do {
        println("Do you want to add another amount?")
        answer = readln().lowercase()

        if (answer == "yes"){
            monetaryamounts.Sum()
        }

    }while (answer == "yes")

    monetaryamounts.Dividedamount()
}

class Activity02D{

    var amount1: Double = 0.00
    var sum: Double = 0.00

    init {
        print("Enter Amount:")
        var amount : Double = readln().toDouble()

        amount1 = amount
        println("Amount is $amount")
    }
    fun Sum(){
        print("Enter another Amount:")
        var amount2: Double = readln().toDouble()

        sum = amount1 + amount2
        println("Total amount is : $sum")
    }
    fun Dividedamount(){
        print("Divided the value by how many?")
        var valueamount: Int = readln().toInt()

        print("Divided Total Amount is ")
        println(sum / valueamount)
    }
}
