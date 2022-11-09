package kodego_ph_assignments_siroy


//You are tasked to create a directory of the students taking this course.
//The data will be used to send updates regarding the classes.
//There is also a need to know the progress of the students during the progress of this course.
//List down all data that can be used to implement this. Use the proper data types.


fun main(){
    var name1 = "Lesa Siroy"
    var name2 = "Marc Quinn"
    var name3 = "Lyan Keem"
    var name4 = "Ryan Neil"
    var grade1 :Int = 74
    var grade2 :Int = 95
    var grade3 :Int = 93
    var grade4 :Int = 75


    println("ADMIN LOGIN")
    println("============")
    print("Username: ")
    var username: String = readln().uppercase()
    var user = "Sally"
    username = user

    print("Password: ")
    var password:String = readln().lowercase()
    var userpassword = "sally123"

    if ((username == user)&&(password == userpassword)){
        println("==========================================================")
        println("==========================================================")
        println("Directory of Students:")
        println("----------------------------------------------------------")
        println(name1)
        println("Date Enrolled: March 3, 2022")
        println("Course Enrolled: Bachelor of Science in Computer Science")
        println("First Grading: $grade1")
        if (grade1 >=75) {
            println("Passed")
        }
        else {
            println("Failed")
        }

        println("=========================================================")
        println(name2)
        println("Date Enrolled: April 5, 2022")
        println("Course Enrolled: Bachelor of Science in Nursing")
        println("First Grading: $grade2")
        if (grade2 >=75) {
            println("Passed")
        }
        else {
            println("Failed")
        }

        println("=========================================================")
        println(name3)
        println("Date Enrolled: May 10, 2022")
        println("Course Enrolled: Bachelor of Science in Architecture")
        println("First Grading: $grade3")
        if (grade3 >=75) {
            println("Passed")
        }
        else {
            println("Failed")
        }

        println("=========================================================")
        println(name4)
        println("Date Enrolled: March 5, 2022")
        println("Course Enrolled: Bachelor of Commerce Major in Accountacy")
        println("First Grading: $grade4")
        if (grade4 >=75) {
            println("Passed")
        }
        else {
            println("Failed")
        }

        println("=========================================================")

        println("Do you want to add grade?: ")
        var answer = readln().lowercase()
        if (answer == "yes") {
            print("Select a Student: ")
            var studentname = readln().lowercase()

            if (studentname == name1) {
                print("Add a grade: ")
                var grade: Int = readln().toInt()
                println("First Grading: $grade1, Second Grading: $grade")
            }
            else if (studentname == name2){
                print("Add a grade")
                var grade1: Int = readln().toInt()
                println("First Grading: $grade2, Second Grading: $grade1")
            }
            else if (studentname == name3){
                print("Add a grade")
                var grade2: Int = readln().toInt()
                println("First Grading: $grade3, Second Grading: $grade2")
            }
            else if (studentname == name4){
                print("Add a grade")
                var grade3: Int = readln().toInt()
                println("First Grading: $grade4, $grade3")
            }else{
                println("Not on the List")
            }
        }else{
            return main()
        }
    }
    else {
    println("Invalid Admin Credentials!!!")
    }
}

