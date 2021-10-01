fun main(){
    println("Question 1\n")
    println("What are the cases that I need to use the map for??")
    println("Solution:If you want to linked each value on the list with unique key.\n" +
            "Example: link the students names to their phone numbers in the database.")

    println("--------------\nQuestion 2\n")
    println("What is the difference between immutable and read only variables?")
    println("I think immutable and read only is the same thing but there is difference\n" +
            "between mutable and immutable\n" +
            "Mutable: can be assigned multiple times.\n" +
            "Immutable can be initialized only single time.")
    println("--------------\nQuestion 3\n")

    //I merged two list and convert it to map
    val numbers = mutableListOf<Double>()
    val strings = mutableListOf<String>()
    val myMap = mutableMapOf<Double,String>()

    var n = 1.0
    for (i in 0 until 20){
        numbers.add(n)
        n++
    }
    println(numbers)

    val abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i in 0 until 20){
        strings.add(abc.substring(i,i+1))
    }
    println(strings)


    for (i in numbers.indices) {
        myMap.put(numbers.get(i), strings.get(i))
    }
    println(myMap)


}