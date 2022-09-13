package PracticeActivities

fun main(){

    maxNumber(2,4,6)

}

fun maxNumber(num1: Int, num2:Int, num3:Int):Int{
    var maxvalue = 0

    if ((num1 > num2)&&(num1 > num3)){
        println("Maximum Number: $num1")
        maxvalue = num1
    }
    else if ((num2 > num1)&&(num2 > num3)){
        println("Maximum Number: $num2")
        maxvalue = num2
    }
    else {
        println("Maximum Number: $num3")
        maxvalue = num3
    }
    return maxvalue
}