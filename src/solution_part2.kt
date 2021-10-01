fun main(){
//q1

    //Create a list and access it and print it, then update or add elements to it

    //crating list
    val y = mutableListOf("Jeddah", "Makkah", "Al-Medina ","Riyadh")
   //access
    println(y[0])
    //print
    println(y)
    //add
    y.add("Al-Baha")
    //update
    y[3]="Aseer"

    println(y)


    println("*************************************************************")

//q2


    //Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
    val n = mutableListOf("A", "B", "C", "D")

    try {
        println(n[5])
    }catch (e: Exception){
        println(e.localizedMessage)
    }

    println(n.getOrElse(6) { "not exited" })


    val elementt: String? = n.getOrNull(7)
    println(elementt)

    val index = 8
    if(index > n.size-1 ){
        println("out of index")
    }
    else{
        println("element of $index index is ${n[index]}")
    }







//q3

    println("")
    println("q3")
    println("")
//Create a list then add repetitive and unique elements to it,
//     then convert it to set,
//      then add new elements to it
//       and print the set values

    //crating list

    val y1 = listOf("Ford", "Toyota","Toyota", "Mercedes","Kia")

    // convert
    var z:Set<String> = y1.toSet()

    //add
    z += "Nisan"

    //print set values
    println(z)


}