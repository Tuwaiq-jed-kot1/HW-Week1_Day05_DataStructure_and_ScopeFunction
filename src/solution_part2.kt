fun main(){

    //Part2

    //Create a list and access it and print it, then update or add elements to it

    val stringList = mutableListOf("Ahmed","Faisal","Omar")
    println(stringList)
    stringList.add(3,"Hanan")
    stringList.add("Eman")
    println(stringList)

    //Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
    //1st Exception

    val names = mutableListOf("Ahmed", "Faisal", "Razan")
    println(names.getOrElse(4){ "Name not found"})

    //2nd Exception

    val math = mutableListOf<Int>()
    val x = 2
    val y = 0
    val z: Int
    try {
        z = x/y
    }catch (e:Exception){
        println("Can not divide by Zero")
    }

    //3rd Exception

    val elements = mutableListOf("Ahmed","Faisal","Omar")

    val index = 4
    if(index > elements.size-1 ){
        println("Error, name not found in the boundaries")}
    else{
        println("The name on the list is: ${elements[index]}")
    }

    //Create a list then add repetitive and unique elements to it, then convert it to set,
    //then add new elements to it and print the set values

    val oldList = listOf("Ahmed","Faisal","Omar","Faisal","Anas",5,7,5).distinct()

    val newList = oldList.toSet()

    println(newList)




//---------------------------------------------------------------------

}