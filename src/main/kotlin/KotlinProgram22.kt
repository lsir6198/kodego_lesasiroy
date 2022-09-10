fun main(){
    displayName()
    displayMessage("Hello!")
    displayNameAndAge("John", 18)

  //  println("Enter number 1:")
  //  var number : Int = readln().toInt()

  //  println("The cube is ${number * number * number}")


}
//no return no parameter
fun displayName():Unit {
    println("Peter")
}
//no return with 1 parameter
fun displayMessage(msg: String) {
    println("The message is $msg")

    }
//not return with 2 parameters
fun displayNameAndAge(name: String, age: Int){
    println("Your name is $name")
    println("Your Age is $age")
}
//built-in functions/standard functions in kotlin
//abstraction

//println()
//toInt()
//main()
//arrayof()
//listof()

//user-defined function