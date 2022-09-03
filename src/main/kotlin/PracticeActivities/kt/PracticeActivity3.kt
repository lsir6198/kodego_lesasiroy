import org.w3c.dom.ranges.Range

fun main(){

    println("Enter Age:")
    var number : Int = readln().toInt()

    if ((number <=17)&&(number >=1))
    {
        println("Under Age")
    }
    else if((number <=30)&&(number >=18))
    {
        println("Young Adult")
    }
    else if((number <=59)&&(number >=31))
    {
        println("Adult")
    }
    else if(number >=60)
    {
        println("Senior")
    }
    else
    {
        println("Invalid Age")
    }
}