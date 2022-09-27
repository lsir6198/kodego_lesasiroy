package com.oop

class Manager: Employee() {

    override fun computeBonus(){
        bonus += (bonus * 0.10)
        super.computeBonus()
    }
}