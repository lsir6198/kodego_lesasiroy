fun main(){
    var joe = Person()
    joe.name = "Joe"
    println(joe.name)
    joe.walk()
    joe.eat()

    var anna = Person()
    println(anna.name)
    anna.walk()
    anna.eat()


}

class Person {
      var name : String = "John"
      var age : Int = 21

    fun walk(){
        println("A person walks")
    }
    fun eat(){
        println("A person eats")
    }
    fun ageUp(){
        age++
    }
}
//other way
//class Person1(personName:String, personaAge:Int)
  //    var name1: String = personName
    //  var age1 : Int = personAge
