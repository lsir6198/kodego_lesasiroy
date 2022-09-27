import PracticeActivities.palindromeChecker



fun main(){

    print("Enter a word: ")
    var word = readln().lowercase()

    try {word}catch (e:CharacterCodingException){
        println(e)
        println("Invalid Input")
    }

    print("Next step is to check if word is Palindrome, Do you want to proceed? ")
    var answer = readln().lowercase()

    try {answer}catch (e:CharacterCodingException){
        println(e)
    }

    if (answer == "yes")
    {
        palindromeChecker(word)
    }
}
