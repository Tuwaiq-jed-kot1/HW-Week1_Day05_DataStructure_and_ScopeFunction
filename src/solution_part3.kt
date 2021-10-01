fun main() {
//    ## Part III - Practice with Maps.
//    ---
//    -  What are the cases that I need to use the map for??
//    ANSWER:  when I want to create a list of my product with it's unique serial number which is keys in map.
//    for example : serial no. : 1234 for product  : Enamel pin1 so i can"t use the same serial number for another product.
//    - What is the difference between immutable and read only variables?
//    ANSWER: immutable variables can't be changed unlike read only variables.
//    - Create a map of 20 elements of strings and doubles
    val fruit = mutableMapOf(
        1 to "Apple", 11 to "Lemon",
        2 to "Orange", 12 to "Papaya",
        3 to "Banana", 13 to "Fig",
        4 to "Kiwi", 14 to "Grape",
        5 to "Watermelon", 15 to "Pomegranate",
        6 to "Strwberry", 16 to "Blackberry",
        7 to "Mango", 17 to "Pear",
        8 to "Cocount", 18 to "Date",
        9 to "Custerd apple", 19 to "Plum",
        10 to "Pineapple", 20 to "Dragon fruit"
    )
    println(fruit)

}