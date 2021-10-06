// what is map in kotlin
// map is a collection which contains pairs of objects. Map holds the data in the form of pairs which consists
// of a key and a value.
// Map keys are unique and the map holds only one value for each key.
// Kotlin distinguishes between immutable and mutable maps.
// Immutable maps created with mapOf() means these are read-only
// and mutable maps created with mutableMapOf() means we can perform read and write both.


// what the difference between mutable and immutable and read only
//There are two types of variables – mutable and immutable. An immutable variable is one whose value cannot be changed,
// also known as unchangeable or read-only variable. On the other hand the value of the mutable variable can be changed.


// 20 element of map that have string and double
fun main () {
    val x = mutableMapOf(4.5 to "apple",
        5.9 to "orange",
        6.1 to "mango",
        4.2 to "orange",
        7.2 to  "mango",
        3.2 to  "banana",
        2.0 to  "apple",
        9.0 to  "kiwi",
        1.1 to  "strawbery",
        3.3 to  "blueberry",
        4.5 to   "peach",
        5.9 to   "orange",
        6.7 to   "apple",
        4.2 to  "orange",
        2.2 to  "mango",
        3.0 to  "guava",
        2.0 to   "apple",
        6.0 to   "grabfruit",
        1.1 to   "strawbery",
        3.2 to   "blueberry" )
    var maxElement = x.maxByOrNull{ it.value }
    println("the fruit value : ${maxElement?.key} and the name is : ${maxElement?.value}")
}