import kotlin.math.sign

fun main(){
    //enter 5 digits, store in array, display in correct sequence and display in reverse.

    println("Enter number 1:")
    var number1 : Int = readln().toInt()
    arrayOf(number1)

    println("Enter number 2:")
    var number2 : Int = readln().toInt()
    arrayOf(number2)

    println("Enter number 3:")
    var number3 : Int = readln().toInt()
    arrayOf(number3)

    println("Enter number 4:")
    var number4 : Int = readln().toInt()
    arrayOf(number4)

    println("Enter number 5:")
    var number5 : Int = readln().toInt()
    arrayOf(number5)

    println("Numbers Entered are:")
    print(number1)
    print(number2)
    print(number3)
    print(number4)
    println(number5)

    print("Numbers in Reversed:")
    println(arrayOf(number1, number2, number3, number4, number5).reversed())
}