fun main(){
    var mySet = setOf(3,6,1,2,2,2,2)

    //mutable set
    var mySet2 = mutableSetOf<Int>()
    mySet2.add(5)
    mySet2.add(7)
    mySet2.add(8)
    mySet2.remove(8)

    for(data in mySet2){
        print(data)
    }

    println(mySet.count())
    println(mySet.sum())
    println(mySet.average())

    for(data in mySet){
        print(data)
    }

    var setA = setOf(2, 5, 7, 8)
    var setB = setOf(1,3,5,7)

    //union
    println(setA.union(setB))

    //intersect
    println(setA.intersect(setB))

    //difference/minus
    println(setA.minus(setB))
    println(setB.minus(setA))

}