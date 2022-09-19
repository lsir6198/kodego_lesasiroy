//**************************Implement Activity 01 - C using data structure.
//**************************Tasked to automate an inventory system for a grocery.

package Exercises
fun main(){

    var items = arrayListOf("Produce Items, Pantry and Dairy Items, Meat and Spices")

    println("List of Items:")
    println("$items")
    println()
    print("Select an Item:")
    var item = readln()

    if (item == "Produce Items"){
        println("Produce Item List:")
        GroceryInventory().ProduceItems()

        print("Do you want to add an items:")
        var answer = readln()
        if (answer == "Yes") {
            GroceryInventory().additems1()
        }
    }
    else if (item == "Pantry and Dairy Items") {
        println("Pantry and Dairy Items List:")
        GroceryInventory().PantryDairyItems()

        print("Do you want to add an item?")
        var answer1 = readln()
        if (answer1 == "Yes"){
            GroceryInventory().additems2()
        }
    }
    else if (item == "Meat") {
        println("Meat:")
        GroceryInventory().Meat()

        print("Do you want to add an item:")
        var answer2 = readln()
        if (answer2 == "Yes") {
            GroceryInventory().additems3()
        }
    }
    else if (item == "Spices"){
        println("Spices:")
        GroceryInventory().Spices()

        print("Do you want to add an item:")
        var answer2 = readln()
        if (answer2 == "Yes") {
            GroceryInventory().additems4()
        }
    }
}

//Activity 02 - F
//Implement Activity 02 - C using Classes.
class GroceryInventory{
    var produceitems = arrayListOf("potatoes, onions, tomatoes, green peppers, celery, carrots and lettuce. Packaged, chopped lettuces are convenient for salads. \n" +
            "Fruits = apples, oranges, bananas, grapes, raisins and peaches. canned fruits")
    var pantrydairyitems = arrayListOf("canned goods, grains, bread, tortilla wraps, rice, hot cereals and cold cereals, macaroni and cheese, spaghetti, peanut , eggs, cheese, yogurt, sour cream, orange juice, butter, jelly, sugar, flour, coffee, milk and tea")
    var meat = arrayListOf("pork, beef, chicken, lamb")
    var spices = arrayListOf("black pepper, salt, garlic powder, onion powder and paprika. Basil, oregano, rosemary and thyme, cocoa powder, cinnamon, cloves, ginger and nutmeg, lemon juice, vinegar, cooking oil and vanilla")

    init {
        println("Grocery Inventory System")
        println("-------------------------")
    }

    fun ProduceItems(){
        println(produceitems)
    }

    fun PantryDairyItems(){
        println(pantrydairyitems)
    }

    fun Meat(){
        println(meat)
    }

    fun Spices(){
        println(spices)
    }

    fun additems1(){
        print("Add an item:")
        var additem1 = readln()
        produceitems.add(additem1)
        println("$additem1 successfully added!!!")
        println(produceitems)
    }
    fun additems2(){
        print("Add an item:")
        var additem2 = readln()
        pantrydairyitems.add(additem2)
        println("$additem2 successfully added!!!")
        println(pantrydairyitems)
    }

    fun additems3(){
        print("Add an item:")
        var additem3 = readln()
        meat.add(additem3)
        println("$additem3 successfully added!!!")
        println(meat)
    }

    fun additems4(){
        print("Add an item:")
        var additem4 = readln()
        spices.add(additem4)
        println("$additem4 successfully added!!!")
        println(spices)
    }
}