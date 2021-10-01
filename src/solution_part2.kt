fun main() {
//## Part II - Practice with Lists and Sets.

    val list = mutableListOf("tree", "branch", "leaves")
    println("\noriginal list: $list")

    //Create a list and access it and print it, then update or add elements to it
    list.add("roots")
    println("new list: $list")

    //Create a list and access out of its bounds, then manage the list errors safety with 3 different ways
    val index= 8

    // First way
    println(list.getOrElse(index) { "\nsafely called: Index not found" })

    //Second way
    println(
        try {
            list[index]
        } catch (e: Exception) {
            "Exception caught"
        }
    )

    //Third way
    println(if (index > -1 && index <= list.size) list[index] else "else case: Index not found")

    //Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values
    list.add("flower")
    list.add("flower")
    list.add("fruit")

    val set = list.toMutableSet()

    set.add("twig")
    println("\nset: $set")
}