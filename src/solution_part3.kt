fun main(){

    //Part3-Q1,Q2

    //What are the cases that I need to use the map for?

    /*Answer: To locate values, in other words, a map provides key-based access using a type that
    you specify. Keys are unique and identify the values in the map; the values, on the other hand, do not
    need to be unique. In this way, Map shares another feature with Set: The keys of a map are guaranteed
    to be unique, just like the elements of a set*/

    //What is the difference between immutable and read only variables?

    /*Answer:An immutable object is one that cannot be changed, once created.
    But a read only variables' means that the reference cannot be changed,
    once set and that it can only be set during object construction.*/

    //Part3-Q3

    var map1 = mutableMapOf(
        1 to "Ahmad",
        2 to 2.0,
        3 to "Rana",
        4 to 32.5,
        5 to "Eman",
        6 to 55.5,
        7 to "Faisal",
        8 to 45.7,
        9 to "Anas",
        10 to 17.1,
        11 to "Abdullah",
        12 to 0.5,
        13 to "Badr",
        14 to 0.8,
        15 to "John",
        16 to 12.7,
        17 to "Alice",
        18 to 9.9,
        19 to "Khalid",
        20 to 9.99,)
    println(map1.values)

//-------------------------------------------------------------

}