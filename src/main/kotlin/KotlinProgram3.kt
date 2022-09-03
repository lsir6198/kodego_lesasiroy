fun main(){
    var number1 : Int = 21
    var number2 : Int = 9

    var answer1 : Int = number1 + number2
    var answer2 : Int = number1 - number2

    println("Answer is $answer1")
    println("Answer is $answer2")

    //complex operations

    var complexFormula: Int =(2*10)+(10/2)
    println(complexFormula)

    //comparison operators
                               //false                //true
    var expression: Boolean = (number1 <= number2 || number1 == number2)
    println(expression)

    //increment operators
    var incrementNum :Int = ++number1
    println(incrementNum)
}