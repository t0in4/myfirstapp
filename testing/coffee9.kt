package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Write how many ml of water the coffee machine has:")
    val water = scanner.nextInt()
    print("Write how many ml of milk the coffee machine has: ")
    val milk = scanner.nextInt()
    print("Write how many grams of coffee beans the coffee machine has:")
    val beans = scanner.nextInt()
    print("Write how many cups of coffee you will need: ")
    var cups = scanner.nextInt()

    val minimum = minOf(water/200, milk/50, beans/15)
    


    if (minimum == water/200){
        var totalCups = water/200
        if (cups == totalCups) {
            println("Yes, I can make that amount of coffee")
        }
        else if (cups > totalCups) {
            println("No, I can make only ${totalCups} cups of coffee")
        }
        else if (cups < totalCups){
            println("Yes, I can make that amount of coffee (and even ${(totalCups-cups)} more than that)")
        }
    }
    else if (minimum == milk/50) {
        var totalCups = milk/50
        if (cups == totalCups) {
            println("Yes, I can make that amount of coffee")
        }
        else if (cups > totalCups) {
            println("No, I can make only ${totalCups} cups of coffee")
        }
        else if (cups < totalCups){
            println("Yes, I can make that amount of coffee (and even ${(totalCups-cups)} more than that)")
        }

    }
    else if (minimum == beans/15) {
        var totalCups = beans/15
        if (cups == totalCups) {
            println("Yes, I can make that amount of coffee")
        }
        else if (cups > totalCups) {
            println("No, I can make only ${totalCups} cups of coffee")
        }
        else if (cups < totalCups){
            println("Yes, I can make that amount of coffee (and even ${(totalCups-cups)} more than that)")
        }
    }
}













