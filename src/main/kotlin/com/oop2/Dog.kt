package com.oop2

class Dog: Animal() {
    override fun makeSound() {
        println("Aw Aw Aw")
    }

    override fun walk() {
        println("A dog walks on four legs")
    }
}