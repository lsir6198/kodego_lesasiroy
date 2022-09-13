

fun main(){

    println(total(2,4,5,5))
    println(total2(2,4,5,6,7,8,9,10))
}

fun total(num1: Int, num2: Int, num3:Int, num4: Int):Int{
    print("This is total function:")
    return num1 + num2 + num3 + num4
}

fun total2(vararg numbers : Int):Int{
    var sumofAllNumbers: Int = 0
    for(num in numbers){
        sumofAllNumbers = sumofAllNumbers + num
    }
    return sumofAllNumbers
}