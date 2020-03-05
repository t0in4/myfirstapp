//package machine

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
    if (cups == 0) {
        println("Yes, I can make that amount of coffee (and even 1 more than that)")
    }
    else {
    val waterPortion = (cups * 200)/water
    val milkPortion = (cups * 50)/milk
    val beansPortion = (cups * 15)/beans
    if (waterPortion != 0) {
        if (milkPortion !=0) {
            if (beansPortion != 0) {
                println("Yes, I can make that amount of coffee")
            }
        }
    }
    else if ((cups*200)/water>((water/200)*cups-cups)&&(cups*15)/beans>(((beans/15)*cups)-cups)&&((milk/(cups*50)>((milk/50)*cups)-cups))) {

        print("(and even ${water / (cups * 200) - cups} more than that)")
    } else (print("No, I can make only ${(water/(cups*200))} cups of coffee"))}}


    if ((cups * 200)/water != 0 && (cups * 50)/milk != 0 && (cups * 15)/beans != 0) {
        println("Yes, I can make that amount of coffee")}
    else if ((cups*200)/water>(((water/200)*cups-cups)&&(cups*15)/beans>(((beans/15)*cups)-cups)&&((milk/(cups*50)>((milk/50)*cups)-cups))){

        print("(and even ${water / (cups * 200)-cups} more than that)")
    } else (print("No, I can make only ${(water/(cups*200))} cups of coffee"))

}









