import java.lang.Exception

//## Part II - Practice with Lists and Sets.
//Create a list and access it and print it, then update or add elements to it
//Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
//Create a list then add repetitive and unique elements to it, then convert it to set,
// then add new elements to it and print the set values

fun main(){
    //Create a list and access it and print it, then update or add elements to it
    var myList1 = mutableListOf("Kiwi", "Strawberry", "Banana", "Coconut")
    println(myList1)
    myList1.add("Mango")
    myList1.remove("Kiwi")
    println(myList1)
    println()
    //=================================================================
    //Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
    //=== FIRST METHOD OF HANDLING OUT OF BOUNDS EXCEPTIONS
    var myList2 = myList1
    try {
        println(myList2[10])
    }
    catch (e: Exception){
        println(e)
    }
    //==== SECOND METHOD
    var element = myList2.getOrNull(10)
    println(element ?: "Index out of bounds!!")
    //==== THIRD METHOD
    var index = 10
    if (index < 0 || index >= myList2.size){
        println("Index out of bounds!!")
    }else{
        println(myList2[index])
    }
    println()
    //=================================================================
    //Create a list then add repetitive and unique elements to it, then convert it to set,
    var myList3 = myList2
    myList3.add("Banana")
    println(myList3)
    var mySet = myList3.toSet()
    println(mySet)
}