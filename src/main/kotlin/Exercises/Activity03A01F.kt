import PracticeActivities.palindromeChecker



fun main(){

    print("Enter a word: ")
    var word = readln().lowercase()

    try {
        if (word.isEmpty()){
            throw Exception()
        }
    }catch (e:Exception){
        println(e)
        println("Invalid Input")
    }

    print("Next step is to check if word is Palindrome, Do you want to proceed? ")
    var answer = readln().lowercase()

    try {
        if (answer.isEmpty()){
            throw Exception()
        }
    }catch (e:Exception){
        println(e)
        println("Invalid Input")
    }

    if (answer == "yes")
    {
        palindromeChecker(word)
    }
}
