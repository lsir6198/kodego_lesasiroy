fun main(){
    var john = Person()
    var joe = Person()
    println("John's memory address is $john")
    println("Joe's memory address is $joe")

    println(john == joe)

    john.name = "Ludwig"
    println(john.name)

    println(joe.name)
}

class Empty {}

class Outer {

    val name = "Outer"
    fun show() = "the name: $name"

    class Nested {
        val name = "Nested"
        fun show() = "the name: $name"
    }
}

class Outer2 {

    val name1 = "Outer2"
    fun show() = "the name: $name1"

    inner class Inner {
        val name2 = "Inner"
        fun show() = "data: $name2 and $name1"
    }
}

//sealed class
//empty class
//nested class
//inner class