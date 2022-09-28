fun main(){

    //instantiation - process of creating an object.
    var myObject = MyClass("Hello World")

    var myObject1 = MyClass("Hi World!")

    var myGenericObject = MyGenericClass("1234567")
}
//Generics
class MyGenericClass<T>(value:T){
      init {
          println(value.toString().length)
      }
}
class MyClass(value: String){
        init{
            println(value.length)
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
