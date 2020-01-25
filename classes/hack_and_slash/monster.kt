class Monster(var hit_points: Int, val color: String, val weapon: String){
    fun printer(){
    println(" Hit points: $hit_points, Color: $color, Weapon: $weapon")
}
}
fun main(args: Array<String>){
    var jubjub = Monster(1,"green", "sword")
    jubjub.printer()
}
