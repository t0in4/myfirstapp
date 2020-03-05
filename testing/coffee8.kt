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
    val minimum = minOf(water,milk,beans)
    

    if (cups == 0 && water == 0 && milk == 0 && beans == 0) println("Yes, I can make that amount of coffee")
    if (cups == 0 && water != 0 && milk != 0 && beans != 0) println("Yes, I can make that amount of coffee (and even ${(water/200)} more than that)")
    if (cups != 0 && water != 0 && milk != 0 && beans != 0) {
        val waterPortion = water * 200 / (cups * 200)
        val milkPortion = milk * 200 / (cups * 50)
        val beansPortion = beans * 200 / (cups * 15)
        val waterMinus = ((water / 200) * cups) - cups
        val milkMinus = ((milk / 50) * cups) - cups
        val beansMinus = ((beans / 15) * cups) - cups


        if (waterPortion >= cups) {
            if (milkPortion >= cups) {
                if (beansPortion >= cups) {
                    println("Yes, I can make that amount of coffee")
                }
                if (waterPortion > waterMinus && beansPortion > beansMinus && milkPortion > milkMinus) {

                    print("(and even ${((water / (200 * cups))-(milk/(50*cups))-(beans/(15*cups))-cups)} more than that)")
                }
            }


        }
        if (waterPortion < cups) {
            if (milkPortion < cups) {
                if (beansPortion < cups) {
                    (print("No, I can make only ${(water / 200)} cups of coffee"))
                }
            }
        }}
    if (water < cups){
        (print("No, I can make only ${(water/200)} cups of coffee"))
    }
}














