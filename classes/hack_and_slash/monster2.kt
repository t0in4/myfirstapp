class Monster(var hit_points: Int, val color: String, val weapon: String){
    val colors = arrayOf("yellow", "red", "blue", "green")
    val points = arrayOf(1,2,3,4)
    val hitpointsChoice = getHitPoints(points)
    val colorChoice = getColorChoice(colors)
    fun getColorChoice(optionsParam: Array<String>) = optionsParam[(Math.random()*optionsParam.size).toInt()]
    fun getHitPoints(optionsParam: Array<Int>) = optionsParam[(Math.random()*optionsParam.size).toInt()]
    fun printer(){
    println(" Hit points: $hitpointsChoice, Color: $colorChoice, Weapon: $weapon")
}
}
fun main(args: Array<String>){
    var jubjub = Monster(1,"green","sword")
    jubjub.printer()
}
