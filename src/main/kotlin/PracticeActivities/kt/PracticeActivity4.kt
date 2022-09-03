fun main(){

    var product1 : String = ("Automatic Washing Machine")
    var product2 : String = ("Refrigerator")
    var product3 : String = ("Frying Pan")
    var product4 : String = ("Electric Stove")

    /*
     Automatic Washing Machine = ("14499")
     Refrigerator = ("18900")
     Frying Pan = ("700.60")
     Electric Stove = ("3550")

     */

    val discount1 : Double = 0.00
    val discount2 : Double = 0.05
    val discount3 : Double = 0.10
    val discount4 : Double = 0.15
    val discount5 : Double = 0.20

    println("List of Products Available:")
    println("$product1,$product2,$product3,$product4")

    println("Enter product:")
    var product : String = readln()

    println("Enter Price:")
    var price : Double = readln().toDouble()

    println("Price of $product is $price")

    var product1discount = discount1 * price
    var product2discount = discount2 * price
    var product3discount = discount3 * price
    var product4discount = discount4 * price
    var otherproduct     = discount5 * price

    var netprice1 = price - product1discount
    var netprice2 = price - product2discount
    var netprice3 = price - product3discount
    var netprice4 = price - product4discount
    var netprice5 = price - otherproduct

    if ((price <=10000)&&(price >=0))
            {
        println("Discount is $product1discount")
        println("NetPrice is $netprice1")
       }
        else if ((price <=20000)&&(price >=10000)){
         println("Discount is $product2discount")
        println("NetPrice is $netprice2")
    }
     else if ((price >=20000)&&(price <=50000)){
         println("Discount is $product3discount")
        println("NetPrice is $netprice3")
    }
     else if ((price >=50001)&&(price <=100000)){
         println("Discount is $product4discount")
        println("NetPrice is $netprice4")
    }
    else{
        println("Discount is $otherproduct")
        println("NetPrice is $netprice5")
    }

}