fun main(){

    println("Enter Grade in Math:")
    var number1 : Int = readln().toInt()

    println("Enter Grade in English:")
    var num2 : Int = readln().toInt()

    println("Enter Grade in Filipino:")
    var number3 : Int = readln().toInt()

    println("Enter Grade in Science:")
    var number4 : Int = readln().toInt()

    var averagegrade = ((number1+num2+number3+number4)/4)
    println("Average Grade is $averagegrade")
}