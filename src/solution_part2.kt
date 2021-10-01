/*
*
* ## Part II - Practice with Lists and Sets.
---
- Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values
*/


fun main() {
     println("- Create a list and access it and print it, then update or add elements to it")
println()
    println("Example withing 'Let'\n")
    val MyList = mutableListOf("Apple", "Orange")
    println("My List : $MyList")
    MyList.add("Banana")
    MyList.remove("Apple")
    println("My new List $MyList \n")

//- Create a list and access out of its bounds, then manage the array errors safety with 3 different ways

println()

    println("--------------------------------------------------------------")

    println("- Create a list and access out of its bounds, then manage the array errors safety with 3 different ways")


    val myList = mutableListOf(1,2,3,4,5)
    println(myList.getOrElse(100){ " It is out of bounds" })

    println("-----------")

    println(" #2 manage errors safety")
    var choice2 : Int? = null
    if (choice2 != null ){
        choice2= myList[5]
        println("you choice is $choice2")
    } else{
        println("$choice2  your choice is out of bounds")
    }

    println("----------")

    println(" #2 manage errors safety")


    var choice3 : Int? = null
    try {
        choice3= myList[100]
    } catch (e: Exception){
        println("$choice2  your choice is out of bounds")
        println(e.message)
    }
    finally {
        println("Enter a new choice")
    }

println()
    println("--------------------------------------------------------------")

    println("- Create a list then add repetitive and unique elements to it, then convert it to set, " +
            "then add new elements to it and print the set values\n")

    val myList2 = listOf(1,2,3,4,5,6).toMutableSet()
    myList2.add(4)
    println(myList2) // it will not accept duplicate




}

