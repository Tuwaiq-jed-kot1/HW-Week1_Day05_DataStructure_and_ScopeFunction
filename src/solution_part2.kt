fun main(){
//Part I point 3
    //Part II point 1
    val myList = mutableListOf<Char>('M', 'A', 'R', 'A', 'H')
    myList.also { println("The list before editing: $myList") }
    myList.add(3, 'A')
    println("The list after editing: $myList")
    println("-------------------------------------")

    //Part II point 2
    val myList1 = mutableListOf(1, 2, 3, 4)
    //handling #1 //if else , safe call, nullability , try catch
    val index = 2
    if(index > myList1.size-1 ){println("This is your 1st handler, your index is out of the list boundaries.")}
    else{
        println("Handler1: Your index contains number: ${myList1[index]}")
    }

    //handling #2
    val g = myList1.getOrElse(8, {"This is your 2nd handler, your index is out of the list boundaries."})
    println(g)

    //handling #3
    try{
        val size =  myList1.size-1
        if(index <= size){
            println("Handler3: Your index contains number:${myList1[index]}")}
    }catch (e: IndexOutOfBoundsException){
        println("This is your 3rd handler, your index is out of the list boundaries.")
    }


    println("-------------------------------------")
    val myList2 = mutableListOf("T-shirt", "Blouse", "Skirt", "T-shirt")
    println("The original list is: $myList2")
    myList2.add("Scarf")
    println("The edited list is: ${myList2.distinct()}")

}