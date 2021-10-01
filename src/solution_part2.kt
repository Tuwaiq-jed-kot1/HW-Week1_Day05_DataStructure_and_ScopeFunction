fun main() {
//    ## Part II - Practice with Lists and Sets.
//    ---
//    - Create a list and access it and print it, then update or add elements to it
    val studentName = mutableListOf( " Ruba " , " Reem " , "Rafa " )
    println("Students List = $studentName")
    studentName.add("Sara")
    println("New List Of Students : $studentName")

// Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
// I wrote only 2 ways
// First way if else
    val listOne = listOf<Int>(4, 3, 2, 1)
    var index = 5
    if (index <= listOne.size - 1) {
        println("You chose number ${listOne[index]}")
    }else{ println("You chose number out of range (choose number from ( 0 to 3 )")

// Second way try & catch

        val index = 3
        try {
            println("${listOne.get(index)}")
        } catch( e: IndexOutOfBoundsException) {
            println("${e.localizedMessage}")
        }

// Create a list then add repetitive and unique elements to it,
//         then convert it to set, then add new elements to it and print the set values
        var listOne = mutableListOf(4, 3, 2, 1)
        listOne.add(4)
        println(listOne)
        val setOne = listOne.toMutableSet()
        println(setOne)
        setOne.add(0)
        println(setOne)
    }
}