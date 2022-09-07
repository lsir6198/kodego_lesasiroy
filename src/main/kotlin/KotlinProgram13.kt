fun main(){
    //implicit declaration
    var names = arrayOf("John", "Paul", "Mark")
     //how to access the elements inside the array "through Index" Index start with 0.
    //for example above array size = 3
    println(names[1])

    //explicit declaration
    var numbers = arrayOf<Int>(1,2,3,5)
    println(numbers[3])

    //array size
    println(numbers.size)
    println("@@@@@@@")
    println(names[0])
    println(names[1])
    println(names[2])
    names[1] = "Matthew" //or names.set(1, "Matthew")
    println(names[0]) //or can be code as println(names.get(0))
    println(names[1])
    println(names[2])

}