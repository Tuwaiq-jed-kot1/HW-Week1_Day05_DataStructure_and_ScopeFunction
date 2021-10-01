fun main(){
    // ****************part 1 in question 2
    //create the list
    val stu = mutableListOf<String>("Maryam","Sara","Hind","Nora") //create the list
    println("the names of enrolled student: $stu")
    stu.add("huda") //add an element
    println("the list after added [Huda] to the course: $stu \n*******")

    // *****************part 2 in question 2
    //access the list out of its bounds,
    //using getOrElse function
    println("try to get index 10 in the list of 5 elements : ${stu.getOrElse(10){" this item doesn't exist"}} \n******")
    // using getOrNull function
    println("try to get index 6 in the list of 5 elements : ${stu.getOrNull(6)?:" Null "}\n******* ")
    // using try and catch
    println("using try and catch : ")
    try { for (i in 0..7) println(" The student name: ${stu[i]}")
    }catch(e: IndexOutOfBoundsException){println(" the list has FIVE items only ! ${e.localizedMessage}")}
    println("*******************")

    // *****************part 3 in question 2
    stu.add("Sara") //for repetition
    stu.add("Nora") //for repetition
    println(" the list with repeated items: $stu \n*******")
    val stuSet=stu.toMutableSet()
    println("the set values :$stuSet \n********")
    stuSet.add("Elham")
    println("the set values after adding [Elham] :$stuSet \n********")
}