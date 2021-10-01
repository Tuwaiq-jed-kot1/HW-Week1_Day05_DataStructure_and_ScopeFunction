fun main() {
    // Part I - with Scope Functions.
    var playerName = listOf<String>("Captain ", "Chris", "Redfield").let { name ->
        name.elementAt(0) + name.elementAt(2)
    }

    var playerHealth = 90
    var playerStatus = run { if (playerHealth >= 80) "He's Fine Don't worry" else "Run Brother Amer Run" }

    println(playerName)
    println("------------")
    println(playerStatus)
    println("------------")

}