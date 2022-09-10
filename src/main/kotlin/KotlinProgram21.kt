fun main(){

    //instantiation - process of creating an object.
    var myObject = MyClass("Hello World")

    var myObject1 = MyClass("Hi World!")
}
class MyClass(value: String){
    init{
        println(value)
    }
}
/*
Class -> used to create object
      -> uppercase (first letter)
      -> examples.
      -> String
      -> Int
object -> entity in programming that can hold variable and functions
       -> functions(process)
 */