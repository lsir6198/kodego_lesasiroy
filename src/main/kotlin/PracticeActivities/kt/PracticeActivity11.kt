fun main(){
    var productSales = saleDiscount("Refrigerator", 45000)
    productSales.productName()
    productSales.discount()
}
class saleDiscount(var product: String, var price: Int){

    init {
        println("***Promo Discount on Selected Items***")
    }
    fun discount(){
        println("Enter Price:")
        this.price = readln().toInt()
        println("Price of ${this.product} is ${this.price}")
        if ((this.price >= 0) && (this.price <= 10000)) {
            var NetPrice1: Int = (this.price)
            println("0% Discount")
        } else if ((this.price >= 10001) && (this.price <= 20000)) {
            var Discount2: Double = ((this.price) * (0.05))
            var NetPrice2: Double = ((this.price) - (Discount2))
            println("Discount is $Discount2")
            println("Net Price is $NetPrice2")
        } else if ((this.price >= 20001) && (this.price <= 50000)) {
            var Discount3: Double = ((this.price) * (0.10))
            var NetPrice3: Double = ((this.price) - (Discount3))
            println("Discount is $Discount3")
            println("Net Price is $NetPrice3")
        } else if ((this.price >= 50001) && (this.price <= 100000)) {
            var Discount4: Double = ((this.price) * (0.15))
            var NetPrice4: Double = ((this.price) - (Discount4))
            println("Discount is $Discount4")
            println("Net Price is $NetPrice4")
        } else if (this.price > 100000) {
            var Discount5: Double = ((this.price) * (0.20))
            var NetPrice5: Double = ((this.price) - (Discount5))
            println("Discount is $Discount5")
            println("Net Price is $NetPrice5")
        }
    }
    fun productName(){
        println("Enter Product Name:")
        this.product = readln().lowercase()
    }
}