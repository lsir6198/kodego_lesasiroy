package com.oop

fun main(){
    var joePerson = Person()
    joePerson.name = "Peter"
    println(joePerson.name)
    joePerson.age = -1
    var ageFromPerson = joePerson.upAge()
    println("Hello World!")
}