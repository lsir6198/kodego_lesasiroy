package Exercises
//Tasked to automate a school’s library.
// Identify the items that can be borrowed in a Library.
// After listing the different items, identify the characteristics of the items. Use the proper data types.

fun main(){
    var Items = "Fiction Books, Non-Fiction Books"

    var fictionbooks = "Romeo and Juliet\n" +
            "Peter Pan, untold series\n" +
            "Science and Beyond\n" +
            "Conjuring Series of Stories Second Edition\n" +
            "The Bureau of Magical Things"

    var nonfictionbooks = "Jose Rizal Biography/Autobiography, Memoirs by Elizabeth Gilbert, " +
            "How to Overcome Frustrations, The Power of Prayers, World Encyclopedias, Wiki Dictionary and Terms"

    var FictionBooks = "A fictional book is a text created specifically for a work in an imaginary narrative that is referred to, depicted, " +
            "or excerpted in a story, book, film, or other fictional work, and which exists only in one or more fictional works. " +
            "A fictional book may be created to add realism or depth to a larger fictional work."

    var NonFictionBooks = "Nonfiction books are based on factual information or real-life events. " +
            "It makes the declaration that it is not fiction because the reader should understand that what is contained inside the book is not imagined and has a basis in the real world."

    println("Welcome to Ormoc City Public Library Online")
    println()
    println("Types of Books")
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
    println("Thank you for visiting Ormoc City Public Library")
}


