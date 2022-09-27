//Activity 03 - A
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F
package Exercises


fun main () {
//Create an application that will accept 2 string inputs.
// Your application will print all unique characters in both Strings.

         print("Enter your Name:")
         var name = readln().lowercase()
         /*name.checkIntOrString()*/

         try{ name }catch (e:Exception){
                 println(e)
                 println("Invalid input")
         }

         println(name)

         print("Enter your Occupation:")
         var occupation = readln().lowercase()
         /*occupation.checkIntOrString()*/

         try { occupation } catch (e: Exception) {
                println(e)
                println("Invalid input")
         }


         println(occupation)


         var setA = setOf(name.get(2))
         var setB = setOf(occupation.get(1))


         print("Unique Letters: ")
         println(setA.union(setB))
         print("Intersecting letters: ")
         println(setA.intersect(setB))
         print("Difference: ")
         println(setA.minus(setB))


}

/*
fun String.checkIntOrString(): Any {
    try {
        var v = toString()
        return when(v){
            v -> String
            else -> Int
        }

    }catch (e:Exception){
        println(e)
        println("Invalid Input")

    }
    return checkIntOrString()

}
*/

