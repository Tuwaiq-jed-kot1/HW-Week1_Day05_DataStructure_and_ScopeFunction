fun main() {
//Create a list and access it and print it,
    val days = mutableListOf("Sun.", "Monday", "Tuesday", "Wednesday", "Thursday")
    println(days)
    //then update or add elements to it
    println("The last day is ${days.last()}")
    days.forEachIndexed { index, day ->
        if (day == "Sun.") days[index] = "Sunday"
    }
    days.add("Friday")
    println(days)

//Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
    val weekendDay = listOf("Friday", "Saturday")
    val index = 2
    //--------------------------1 (Try and Catch)---------------------
    try {
        println("The day at the index  is ${weekendDay[index]}")
    } catch (e: Exception) {
        println("The index out of bounds, Try again!")
    }
    //--------------------------2 (if else)---------------------
    if (index < weekendDay.size && index >= 0) {
        println("The day at the index  is ${weekendDay[index]}")

    } else {
        println("The index out of bounds, Try again!")

    }
    //--------------------------3 (getOrNull)---------------------
    //\r to delete  the beginning text
    println("The day at the index  is ${weekendDay.getOrNull(index) ?: "\rThe index out of bounds, Try again!"}")


//Create a list then add repetitive and unique elements to it,
    val listOfWorkDays = listOf("Sun.", "Monday", "Tuesday", "Monday", "Wednesday", "Monday")
//then convert it to set,
    val setOfWorkDays = listOfWorkDays.toMutableSet()
    println("list of workdays : $listOfWorkDays")
    println("set of workdays : $setOfWorkDays")
// then add new elements to it and print the set values
    setOfWorkDays.add("Thursday")
    println("the set values are : $setOfWorkDays")

}