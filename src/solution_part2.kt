fun main() {

    val v = mutableListOf("ahmed  ", "anas", "Roula")
    println("The list before " + v)

//add
    println("Add mohammed: ${v.add("mohammed")}")
    println("The list after add: $v")

    //errors
    val g = v.getOrElse(3) {

        println("soory")
    }
    try {

        val test: String? = v.getOrNull(3)


    }
    catch  (e: Exception) {
        println("you do any error ${e.localizedMessage} ")

    }


//unique elements to it
    val v2 = mutableListOf("ahmed  ", "anas", "anas").toSet().toList()
}