fun main(){
//Kotlin program that will accept your first name, middle initial/name, and last name then display them together in a single on the screen


    println("Enter Your First Name:")
    var firstname : String = readln()

    println("Enter Your Middle Name:")
    var middlename :String = readln()

    println("Enter Your Last Name:")
    var lastname :String = readln()

    var name = firstname + middlename + lastname
        print("Your Name is $name")

}