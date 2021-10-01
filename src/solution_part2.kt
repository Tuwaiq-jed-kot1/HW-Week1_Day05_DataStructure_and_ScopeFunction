fun main() {
    val animals = listOf("cat", "dog", "frog", "lion", "wolf")
    println(animals)
    var animalAdd = mutableListOf("cat", "dog", "frog", "lion", "wolf")
    animalAdd.add("bird")
    println(animalAdd)

    try {

    } catch (e: IndexOutOfBoundsException) {
    val numbers = mutableListOf(1, 1, 3, 5, 7, 8, 9)
    numbers[10]
    println(numbers)
}
    val numbers= mutableListOf(1, 1, 3, 5, 7, 8, 9)
    println(numbers.getOrElse(10) { "Out of band" })

val newList = mutableListOf("33","6","8","33","4","8","5","7").toSet
    println(newList)
}