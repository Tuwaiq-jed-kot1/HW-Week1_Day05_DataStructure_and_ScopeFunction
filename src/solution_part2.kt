fun main() {
    //Part II - Practice with Lists and Sets.
    val enemies = mutableListOf<String>("Zombie", "Hunter", "Nemesis", "Hunter", "Dogs")
    println(enemies)
    enemies.add("Mister X")
    println("------------")
    println(enemies)
    println("------------")

    val healthPotionsPoints = listOf<Int>(20, 40, 80, 100, 40, 40, 100, 60).toSet()
    println(healthPotionsPoints)

    healthPotionsPoints.elementAtOrElse(15, { 20 })
    healthPotionsPoints.elementAtOrNull(20)
    try {
        healthPotionsPoints.elementAt(20)
    } catch (e: Exception) {
        println("------------")
        println(e.localizedMessage)
    }

}