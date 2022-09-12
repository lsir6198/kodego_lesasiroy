package Exercises

fun main() {
    var bscsnames = arrayOf("Lesa Siroy", "Asel Omega", "Lei Zah")
    var bscenames = arrayOf("Marc Quinn", "Lyan Keem", "Ryan Neil")
    var bsitnames = arrayOf("Sally Milagrosa", "Leonardo Lopez", "Anacorita Omega")
    var bscsstudent1info: String = "Enrolled SY: 2022-2023, Birthdate: January 3, 1990"
    var bscsstudent1grade = arrayListOf("First Grading: 89, Second Grading: 91")
    var bscsstudent2info = "Enrolled SY: 2022-2023, Birthdate: December 25, 1991"
    var bscsstudent2grade = arrayListOf("First Grading: 91, Second Grading: 92")
    var bscsstudent3info = "Enrolled SY: 2022-2023, Birthdate: September 8, 1988"
    var bscsstudent3grade = arrayListOf("First Grading: 89, Second Grading: 95")

    var courses: String = "BSCS, BSCE, BSIT"

    println("List of Courses:")
    println(courses)
    print("Select Name of Course to check the list of Students Enrolled:")
    var course: String = readln()
    if (course == "BSCS") {
        println(bscsnames[0])
        println(bscsnames[1])
        println(bscsnames[2])
    } else if (course == "BSCE") {
        println(bscenames[0])
        println(bscenames[1])
        println(bscenames[2])
    } else //if (course == "BSIT")
    {
        println(bsitnames[0])
        println(bsitnames[1])
        println(bsitnames[2])
    }
    print("Do you want to Access Student School Records:")
    var response = readln()

    if (response == "Yes") {
        print("Type Student Name:")
        var studentname = readln()

        if (studentname == bscsnames[0]) {
            println(bscsstudent1info)
            println(bscsstudent1grade)
            print("Do you want to add Third Grading grade?")
            var answer = readln()
            if (answer == "Yes") {
                print("Third Grading Grade:")
                var thirdgrading = readln()
                bscsstudent1grade.add("Third Grading: $thirdgrading")
                println(bscsstudent1grade)
            }
        }
        else if (studentname == bscsnames[1]) {
            println(bscsstudent2info)
            println(bscsstudent2grade)
            print("Do you want to add Third Grading grade?")
            var answer = readln()
            if (answer == "Yes") {
                print("Third Grading Grade:")
                var thirdgrading = readln()
                bscsstudent2grade.add("Third Grading: $thirdgrading")
                println(bscsstudent2grade)
            }
        }
            else if (studentname == bscsnames[2]){
                println(bscsstudent3info)
                println(bscsstudent3grade)
                print("Do you want to add Third Grading grade?")
                var answer = readln()
                if (answer == "Yes") {
                    print("Third Grading Grade:")
                    var thirdgrading = readln()
                    bscsstudent3grade.add("Third Grading: $thirdgrading")
                    println(bscsstudent3grade)
                }
            }
    }
}

//Implement Activity 01 -  A using data structure.
//tasked to create a directory of the students taking this course
