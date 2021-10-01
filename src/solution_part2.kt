fun main(){
//>>>>>>>>>>> Create a list and access it and print it, then update or add elements to it

    val list1 = mutableListOf(10,20,30,40,50)
    println(list1[2])
    list1.add(60)
    println(list1)
    println()  // just to make space

    // ________________________________________________________________________

//>>>>>>>>>>> Create a list and access out of its bounds, then manage the array errors safety with 3 different ways

    //________________________________________________  the first errors safety
    val list2  = mutableListOf(10,20,30,40,50)
    println(list2.getOrElse(6){ "The index is not available" })
    println()  // just to make space

    //________________________________________________  the second errors safety
    val list3 = mutableListOf(10,20,30,40,50)
    val x = list3.getOrNull(6)
    if (x == null){
        println("you out of the range")
    }else{
        println(x)
    }
    println()  // just to make space

    //________________________________________________ the third errors safety
    val list4 = mutableListOf(10,20,30,40,50)
    try {
        println(list4[6])
    }catch (e:Exception){
        println("error: ${e.message}")
    }
    println()  // just to make space
    //__________________________________________________________________________

    //Create a list then add repetitive and unique elements to it,
    // then convert it to set,then add new elements to it and print the set values

    println(" this is for list: ")
    val list5 = mutableListOf(10,20,30)
    println(list5)
    list5.add(10)
    list5.add(40)
    println(list5)
    println()  // just to make space

    println(" this is for set: ")
    val set1 = list5.toMutableSet()
    println(set1)
    set1.add(10)     // you cannot add same number on ((set))
    set1.add(50)
    println(set1)

}