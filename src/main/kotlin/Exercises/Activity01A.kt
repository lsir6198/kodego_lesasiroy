package Exercises

//tasked to create a directory of the students taking this course.
//The data will be used to send updates regarding the classes.
// There is also a need to know the progress of the students during the progress of this course.

fun main(){
    var name1 = "Lesa Siroy"
    var name2 = "Marc Quinn"
    var name3 = "Lyan Keem"
    var grade1 :Int = 74
    var grade2 :Int = 95
    var grade3 :Int = 93
  //  var isEnrolled :Boolean = true


    println("Directory of Students in Class MD1P Batch 2")
    println("List of Students:")
    print("$name1, ")
  //  println("is Enrolled = $isEnrolled")
    println("Grade is $grade1")
    if (grade1 >=75) {
        println("Passed")
        }
    else {
        println("Failed")
         }

    print("$name2, ")
  //  println("is Enrolled = $isEnrolled")
    println("Grade is $grade2")
    if (grade2 >=75)
        {
        println("Passed")
        }
    else {
        println("Failed")
         }

    print("$name3, ")
 //   println("is Enrolled = $isEnrolled")
    println("Grade is $grade3")
    if (grade3 >=75)
        {
        println("Passed")
        }
    else {
        println("Failed")
         }
    print("-------End of List-------")
}