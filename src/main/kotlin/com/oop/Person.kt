package com.oop

class Person {
    var name : String = "John"
    var age : Int = 23

    init {
        println("Object Created!")
        println("name is $name, age is $age")
    }

    fun upAge():Int{
        age++
        return age
    }

    fun change(age:Int){
        println(age)
    }
}