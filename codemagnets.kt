fun main(args: Array<String>){
    var x = 0
    val index = arrayOf(1,3,4,2)
    val fruit = arrayOf("Apple","Banana","Cherry","Blueberry","Pomegranate")
    while(x<4){
        var y:Int
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x+1
    }
}
