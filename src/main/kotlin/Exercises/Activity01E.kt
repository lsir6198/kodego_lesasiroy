package Exercises
fun main (){

//Create an application that will accept 2 string inputs.
// Your application will print all unique characters in both Strings.

  //  var name : String = " Lesa "
  //  var occupation : String = " BSCS "

    print("Enter your Name:")
    var name = readln()
    println(name)

    print("Enter your Occupation:")
    var occupation = readln()
    println(occupation)

    var setA = setOf(name.get(3))
    var setB = setOf(occupation.get(2))

    println(setA.union(setB))
    println(setA.intersect(setB))
    println(setA.minus(setB))

}

