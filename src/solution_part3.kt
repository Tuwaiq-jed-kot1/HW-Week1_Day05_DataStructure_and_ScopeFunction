/*
## Part III - Practice with Maps.

*/

fun main(){

    println("Write an answer to this question: What are the cases that I need to use the map for?")
println("A map is a key/value pairs with unique key so we can use it to save a data for unique ID ")

  println(" What is the difference between immutable and read only variables?")
println("The difference between immutable and read only variables?\n")
    println("1- Read-only list  : List cannot be modified after you create it.")

    println("2- Mutable list : MutableList can be modified after you create it," +
            " meaning you can add, remove, or update its elements.")
println()
    println("- Create a map of 20 elements of strings and doubles\n")

    val grads = mutableMapOf(
        1123 to "30",
        2123 to "30",
        3123 to "24",
        4123 to "24",
        5123 to "24",
        6123 to "30",
        7123 to "24",
        8123 to "24",
        9123 to "24",
        1012 to "16",
        1112 to "16",
        1212 to "30",
        1312 to "18",
        1412 to "17",
        1512 to "22",
        1612 to "24",
        1712 to "23",
        1812 to "30",
        1912 to "30",
        2012 to "14"
    )
    println(grads)

}