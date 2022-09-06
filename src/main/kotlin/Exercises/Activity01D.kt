fun main(){
    var answer : Boolean = true
    var ctr = 1

    print("Enter Amount:")
    var amount : Double = readln().toDouble()

    println("Do you want to add another amount?")
    var input = readln()

    while(answer){
        println("Enter another amount:")
        var amount1: Double = readln().toDouble()
        ++ctr
        if (ctr > 5) break
    }

    print("Divide the value by how many?")
    var input1: Int = readln().toInt()
    var quotient = amount / ctr
    print("Divided value is $quotient")


}

