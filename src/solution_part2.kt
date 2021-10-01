fun main() {
    // Question 1 : crating list , adding and modifying
    val muList: MutableList<Int> = mutableListOf(1, 2, 3)
    println("Mutable List = $muList")
    muList[0] = 99
    muList.add(150)
    println("Mutable List (modified) = $muList")

    println() // to add line between Questions

    // Question 2 : note : For simplicity, we are going to use the same list from the previous Question
    println(accessOutOfBounds1(muList, 600)) // Call to the First method of Solving the Error
    println(accessOutOfBounds2(muList, 700)) // Call to the Second method of Solving the Error
    println(accessOutOfBounds3(muList, 800)) // Call to the Third method of Solving the Error

    println() // to add line between Questions

    // Question 3 : note : For simplicity, we are going to use the same list from the previous Question

    for (index in 20..25) { // for loop to add repetitive and unique elements to the existing List
        muList.add(index)
        muList.add(5555)
    }
    println("Mutable List = $muList")
    val muSet: MutableSet<Int> = muList.toMutableSet()
    println("Mutable Set = $muSet")
    println(
        "Mutable Set (added) = ${
            muSet.let { ourSet -> // I used let to get more practice with it 
                ourSet.add(9999)
                ourSet
            }
        }"
    )


}
// Q2-1 Function
fun accessOutOfBounds1(muList: MutableList<Int>, index: Int): String {
    // Normal try-catch Exception Handling
    return try {
        "Your value of the index ($index) = ${muList.get(index)} "
    } catch (e: IndexOutOfBoundsException) {
        "-- ERROR 1 -- ${e.localizedMessage}"
    }
}
// Q2-2 Function
fun accessOutOfBounds2(muList: MutableList<Int>, index: Int): String {
    // Normal if condition
    return if (index < muList.size && index >= 0) {
        "Your value of the index ($index) = ${muList[index]} "
    } else {
        "-- ERROR 2 -- Index $index out of bounds for length ${muList.size}"
    }
}
// Q2-3 Function
fun accessOutOfBounds3(muList: MutableList<Int>, index: Int): String {
    // I used the function getOrElse to return the result within a String or else use lambda and return an Error Message
    return "Your value of the index ($index) = ${
        muList.getOrElse(index) {
            return "-- ERROR 3 -- Index $it out of bounds for length ${muList.size}  "
        }
    }"

}