fun main(){
    //_________________________Lists and Sets___________________________//

    //Create a list and access it and print it, then update or add elements to it
    val listName = mutableListOf("Nadia","Ali","Mohammed")//create a list
    listName.forEach{

        println( it+"\u00B6")//access list

    }
    println(listName)//print list
    listName.add("Almarashi")//update list
    println(listName)//after update

//Create a list and access out of its bounds,
// then manage the array errors safety with 3 different ways

    val listCheck = listOf<Int>()//Create a list

    //Example 1

    if (listCheck.isEmpty() != true)

        println(listCheck[0])
    else{

        println("out of its bounds!!!! Ops //if-else ")
    }
    //Example 2
    try {
        println(listCheck[0])
    }catch (e:Exception){
        println("out of its bounds!!!! Ops //try-catch ")

    }
    //Example 3

    val test= listCheck.getOrNull(0)

    println(test)//return null


//    Create a list then add repetitive and unique elements to it, then convert it to set,
//    then add new elements to it and print the set values
    val numbers = mutableListOf(1,2,2,2,3,4,5,5,6).distinct()
    println(numbers)
}