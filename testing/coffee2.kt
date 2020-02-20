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
    val cups = scanner.nextInt()
    if (water/(cups * 200) != 0 && milk/(cups * 50) != 0 && beans/(cups * 15) != 0) {
        print("Yes, I can make that amount of coffee")}
        else if (water / (cups * 200) != cups ) {
            if (beans/(cups*15)>(((beans/15)*cups)-cups)&&((milk/(cups*50)>((milk/50)*cups)-cups))){
            
            print("(and even ${water / (cups * 200)} more than that)")
        }} else (print("No, I can make only ${(water/(cups*200))} cups of coffee"))

}


