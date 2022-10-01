//Activity 03 - A
//Add try-catch to Activity 01 - D, Activity 01 - E, Activity 01 - F
package Exercises


fun main () {
//Create an application that will accept 2 string inputs.
// Your application will print all unique characters in both Strings.

         print("Enter your Name:")
         var name = readln().lowercase()
         /*name.checkIntOrString()*/

         try{
             if (name.isEmpty()){
                 throw Exception()
             }
             println("Name is $name")

         }catch (e:Exception){
             println("Please enter a valid input")
         }


         print("Enter your Occupation:")
         var occupation = readln().lowercase()

        try{
            if (occupation.isEmpty()){
                throw Exception()
        }
            println("Occupation is $occupation")

        }catch (e:StringIndexOutOfBoundsException){
            println(e)
            println("Please enter a valid input")
        }


         var setA = setOf(name.get(2))
         var setB = setOf(occupation.get(1))


         print("Unique Letters: ")
         println(setA.union(setB))
         print("Intersecting letters: ")
         println(setA.intersect(setB))
         print("Difference: ")
         println(setA.minus(setB))


}

