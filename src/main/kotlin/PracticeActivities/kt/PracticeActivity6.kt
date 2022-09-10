package PracticeActivities

fun main(){

    println("Enter a word: ")
    var input : String = readln()
    palindromeChecker(input)

}
fun palindromeChecker(input:String){
            print("If reversed : ")
            println(input.reversed())
            print("word length is ")
            println(input.length)
            if (input == input.reversed())
            {
                println("Word is Palindrome.")
            } else //if (word != word.reversed())
            {
                println("Word is not Palindrome.")
            }
        }



