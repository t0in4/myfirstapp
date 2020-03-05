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
    val waterPortion = water/(cups*200)
    val milkPortion = milk/(cups*50)
    val beansPortion = beans/(cups*15)
    val waterMinus = ((water/200)*cups)-cups
    val milkMinus = ((milk/50)*cups)-cups
    val beansMinus = ((beans/15)*cups)-cups
    if (cups == 0)println("Yes, I can make that amount of coffee (and even 1 more than that)")



    else if (waterPortion >= cups) {
         if (milkPortion >= cups) {
            if (beansPortion >= cups) {
                println("Yes, I can make that amount of coffee")
            }
        }

    }

    else if (waterPortion>waterMinus&&beansPortion>beansMinus&&milkPortion>milkMinus) {

        print("(and even ${water / (cups * 200) - cups} more than that)")
    }
    else if (waterPortion<cups){
         if(milkPortion < cups){
             if (beansPortion < cups){
                (print("No, I can make only ${(water/200)} cups of coffee"))
            }
        }
    }
}













