package Exercises
fun main(){
//Tasked to automate an inventory system for a grocery.
//Identify the items that can be bought in a grocery store.
//After listing the different items, identify the characteristics of the items.
//Tasked to group the items in categories to help manage the grocery.  Use the proper data types.

    var items = "Produce Items, Pantry and Dairy Items, Meat and Spices"
    var produceitems = "potatoes, onions, tomatoes, green peppers, celery, carrots and lettuce. Packaged, chopped lettuces are convenient for salads. \n" +
            "Fruits = apples, oranges, bananas, grapes, raisins and peaches. canned fruits"
    var pantrydairyitems = "canned goods, grains, bread, tortilla wraps, rice, hot cereals and cold cereals, macaroni and cheese, spaghetti, peanut , eggs, cheese, yogurt, sour cream, orange juice, butter, jelly, sugar, flour, coffee, milk and tea"
    var meat = "pork, beef, chicken, lamb"
    var spices = "black pepper, salt, garlic powder, onion powder and paprika. Basil, oregano, rosemary and thyme, cocoa powder, cinnamon, cloves, ginger and nutmeg, lemon juice, vinegar, cooking oil and vanilla"


    println("Below are the list of available items")
    println("List of Items:")
    println("$items")
    println()
    var itemsNumber : Int = 3
    when(itemsNumber){
        1 -> println("Produce Items available stocks: $produceitems")
        2 -> println("Pantry and Dairy Items available stocks: $pantrydairyitems")
        3 -> println("$meat")
        4 -> println("Spices available stocks: $spices")
    }

}