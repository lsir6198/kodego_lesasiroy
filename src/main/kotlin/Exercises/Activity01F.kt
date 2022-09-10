package Exercises
fun main() {
// Create an application that will accept 1 string.
// Your application will print “Palindrome” if the string is a palindrome.

    //  var string1 = " Radar "

//    println("First word is$string1")
//    print("String Length is ")
//    println(string1.length)
//    print("Second word is")
//    println(string1.reversed())
//    println("String1 is Palindrome")
//    print("End of Line")

    var answer = "Yes"

    print("Enter a word: ")
    var word = readln()

    print("Next step is to check if word is Palindrome, Do you want to proceed? ")
    answer = readln()

    if (answer == "Yes")
    {
        print("Checking: $word ")
        print("If reversed : ")
        println(word.reversed())
        print("word length is ")
        println(word.length)
        if (word == word.reversed())
        {
            println("Word is Palindrome.")
        } else //if (word != word.reversed())
        {
            println("Word is not Palindrome.")
        }
    }
}

