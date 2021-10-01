import java.util.*

fun main() {
//## Part III - Practice with Maps.
    println("\nQ: Write an answer to this question: What are the cases that I need to use the map for??")
    println("- useful when we want unique keys to be attached to data")
    println("- for example unique email and object of user data, 'mapOf<String,Objects>'")

    println("\nQ: What is the difference between immutable and read only variables?")
    println("- read-only: cannot be re-assigned once initialized. val is read-only.")
    println("- immutable: there is no way to change the state of the object/field.")

    println("\nQ: Create a map of 20 elements of strings and doubles")
    val map = mutableMapOf<Double, String>()
    for (i in 1..20) {
        map[i.toDouble()] = "Hi for the $i time!"
    }

    println(map)

}