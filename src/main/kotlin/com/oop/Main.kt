package com.oop

fun main(){
    var manager = Manager()
    manager.computeBonus()
    //1000.00 + 10%

    var staff = Staff()
    staff.computeBonus()
    //1000

    println("Staff salary ${staff.salary}")
    println("Manager salary ${manager.salary}")
}