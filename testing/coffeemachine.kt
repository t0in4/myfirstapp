import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Write how many ml of water the coffee machine has: ")
    val water = scanner.nextInt()
    print("Write how many ml of milk the coffee machine has: ")
    val milk = scanner.nextInt()
    print("Write how many grams of coffee beans the coffee machine has: ")
    val beans = scanner.nextInt()
    print("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()
    if (water%(cups * 200)== 0) println("OK")

}
