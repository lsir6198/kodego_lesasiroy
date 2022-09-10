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

    print("Unique Letters: ")
    println(setA.union(setB))

    print("Intersecting letters: ")
    println(setA.intersect(setB))

    print("Difference: ")
    println(setA.minus(setB))

}

