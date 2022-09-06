package Exercises
fun main() {

    //Using Activity 01 - B and Implement a process where someone can borrow a book.

    var Items = "Fiction Books and Non-Fiction Books"

    var fictionbooks = "Romeo and Juliet\n" +
            "Peter Pan, untold series\n" +
            "Science and Beyond\n" +
            "Conjuring Series of Stories Second Edition\n" +
            "The Bureau of Magical Things"

    var nonfictionbooks = "Jose Rizal Biography/Autobiography, Memoirs by Elizabeth Gilbert, " +
            "How to Overcome Frustrations, The Power of Prayers, World Encyclopedias, Wiki Dictionary and Terms"

    var FictionBooks =
        "A fictional book is a text created specifically for a work in an imaginary narrative that is referred to, depicted, " +
                "or excerpted in a story, book, film, or other fictional work, and which exists only in one or more fictional works. " +
                "A fictional book may be created to add realism or depth to a larger fictional work."

    var NonFictionBooks = "Nonfiction books are based on factual information or real-life events. " +
            "It makes the declaration that it is not fiction because the reader should understand that what is contained inside the book is not imagined and has a basis in the real world."

    println("Welcome to Ormoc City Public Library Online")
    println()
    println("Types of Books Available as of Today") //availability of books are updated daily
    println("$Items")
    println()
    println("What is a Fiction Books:")
    println("$FictionBooks")
    println("Types of Fiction Books:")
    println("$fictionbooks")
    println()
    println("What is a Non-Fiction Books:")
    println("$NonFictionBooks")
    println("Types of Non-Fiction Book:")
    println("$nonfictionbooks")
    println()

    var answer: String = "Yes"


    print("Do you want to borrow a book/s?")
    var ans: String = readln()

    while (answer == "Yes") {
        println("What book/s do you want to borrow? Fiction of NonFiction?")
        var answer1 = readln()
        if (answer1 == "Fiction") {
            println(fictionbooks)
            print("What Fiction Books? =")
            var selectedbook = readln()
            print("Full Name:")
            var name = readln()
            println("All Fiction Books should be returned within 7 days from date borrowed. Have a Nice Day")
            break
        } else if (answer1 == "NonFiction") {
            println(nonfictionbooks)
            print("Which of the NonFiction Books? =")
            var selectedbook1 = readln()
            print("Full Name:")
            var name1 = readln()
            println("All NonFiction Books should be returned within 3 days from date borrowed. Have a Nice Day")
            break
        }
    }

         println("Thank you for visiting Ormoc City Public Library. Have a nice day! God Bless")
     }




