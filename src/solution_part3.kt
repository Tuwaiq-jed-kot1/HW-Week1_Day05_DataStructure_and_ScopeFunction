//---->  Q1     What are the cases that I need to use the map for?

//##[ answer ]  : ---> if we need collection which contains pairs of objects,
//Map holds the data in the form of pairs which consists of a key and a value.

//---->    Q2   What is the difference between immutable and read only variables?

//##[ answer ]  : --->     An immutable can't be modified in any (safe) routines.,
//but read-only values can. Final values themselves are immutables,but the values referenced by them might not.

//>>>>>>>>>>> Create a map of 20 elements of strings and doubles :
fun main(){
    val GPA = mutableMapOf(
        "faisal" to 5.00, "ahmad" to 3.75,
        "khalid" to 3.20, "marwan" to 3.40,
        "anas" to 2.50, "naif" to 3.85,
        "nawaf" to 3.65, "basil" to 3.30,
        "abdulrahman" to 4.00, "rami" to 4.50,
        "husam" to 4.10, "azzam" to 4.20,
        "bassam" to 4.40, "fahad" to 3.90,
        "mazin" to 4.40, "mohammed" to 4.07,
        "abdullah" to 4.19, "hassan" to 3.69,
        "shaher" to 3.05, "saad" to 4.85,


        )
    println(GPA)

}