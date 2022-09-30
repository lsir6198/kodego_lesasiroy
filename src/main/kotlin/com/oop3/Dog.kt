package com.oop3

class Dog:Mammal(), Animal,Pet{
    override fun walk() {
        println("Dog walks")
    }

    override fun makeSound() {
        println("aw aw")
    }

    override fun groom() {
        println("Dog can be groomed")
    }

    override fun feed() {
        println("Dog feeds")
    }

}