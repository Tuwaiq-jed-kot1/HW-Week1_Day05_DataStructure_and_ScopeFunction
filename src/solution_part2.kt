fun main() {

    println("## Part II - Practice with Lists and Sets. \n- Create a list and access it and print it, then update or add elements to it")


    val list1 = listOf(1, 2, 3, 4).toMutableList()
    println("original list $list1")
    list1.add(5)
    list1.remove(3)
    println("updated list $list1")


    println("\n\n----------------------------------------------------\n\n")

    println("- Create a list and access out of its bounds, then manage the array errors safety with 3 different ways")

    val list2  = listOf(1, 2, 3)
    println("------##First way##------")
    val x : Int? = list2.getOrNull(4)
    println("$x  It is out of bounds")

    println("-----##Second way##------")
    var y : Int? = null
     if (y != null ){
         y= list2[5]
         println(y)
    } else{
        println("It's out of bounds")
    }
    println("-----##Third way##------")
    var z : Int? = null

    try {
        z= list2[6]
    } catch (e: Exception){
        println(e.message)
    }
finally {
    println("Try another index")
}


    println("\n\n----------------------------------------------------\n\n")

    println("- Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values\n")

    val list3 = listOf("a","b","c","a","c","d").toMutableSet()
    list3+= "e"
    println(list3)







}