



// Part III - Practice with Maps.

// Write an asnwer to this question: What are the cases that I need to use the map for??
//A map is a collection that holds pairs of objects. Each pair consists of a key
// and a value. Map keys are unique; the map holds only one value for each key.



// What is the difference between immutable and read only variables?
//Immutable is an object/variable whose state cannot be modified after it is created;
//that’s not true with val fields: as stated in the Kotlin Reference val is
//intended to define read-only (a.k.a. assign once) fields, in other words
//“values”, while var is used for mutable variables. There’s a subtle difference
//between read-only and immutable. The former cannot be re-assigned once initialized,
//for the latter there is no way to change the state of the object/field.

// Create a map of 20 elements of strings and doubles
fun main() {

    var namesAndScores = mutableMapOf(

        "Anna" to 2,
        "Brian" to 2,
        "Craig" to 3,
        "Donna" to 4,
        "Anna" to 5,
        "Brian" to 6,
        "Craig" to 7,
        "Donna" to 8,
        "Anna" to 9,
        "Brian" to 10,
        "Craig" to 11,
        "Donna" to 12,
        "Anna" to 13,
        "Brian" to 14,
        "Craig" to 15,
        "Donna" to 16

    )
    println(namesAndScores)

}
