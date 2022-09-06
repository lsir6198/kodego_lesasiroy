package Exercises
fun main(){
    //Create an application that will accept 2 Integers.
   // It will identify the lower value and bigger value of the two inputs.
   //Then, your application will print all the prime numbers starting from the lower number upto the largest number.

    println("Choose a number from the list: 1,2,3,4,5,6,7,8,9,10")
    println()
    print("Enter your first chosen number:")
    var number1 : Int = readln().toInt()
    println()
    print("Enter your second number:")
    var number2 : Int = readln().toInt()

    if (number1 < number2){
        println("$number2 is the bigger value and $number1 is the lower value")

    }
    print("End of code")
}