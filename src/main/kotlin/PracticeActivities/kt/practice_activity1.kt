fun main(){
//Kotlin program that will accept your first name, middle initial/name, and last name then display them together in a single on the screen

    var firstname : String = "Lesa"
    var middlename :String = "Omega"
    var lastname :String = "Siroy"
    var name = (firstname+middlename+lastname)

    println("Enter Your First Name: $firstname")
    println("Enter Your Middle Name: $middlename")
    println("Enter Your Last Name: $lastname")
    print("Your Name is $name")
}