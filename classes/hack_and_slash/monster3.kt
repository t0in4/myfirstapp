class Monster(){
    val colors = arrayOf("yellow", "red", "blue", "green")
    val points = arrayOf(1,2,3,4)
    val weapons = arrayOf("sword", "spear", "bow")
    val hitpointsChoice = getHitPoints(points)
    val colorChoice = getColorChoice(colors)
    val weaponChoice = getWeaponChoice(weapons)
    fun getColorChoice(optionsParam: Array<String>) = optionsParam[(Math.random()*optionsParam.size).toInt()]
    fun getHitPoints(optionsParam: Array<Int>) = optionsParam[(Math.random()*optionsParam.size).toInt()]
    fun getWeaponChoice(optionsParam: Array<String>) = optionsParam[(Math.random()*optionsParam.size).toInt()] 
    fun printer(){
    println(" Hit points: $hitpointsChoice, Color: $colorChoice, Weapon: $weaponChoice")
}
}
fun main(args: Array<String>){
    var jubjub = Monster()
    jubjub.printer()
}
