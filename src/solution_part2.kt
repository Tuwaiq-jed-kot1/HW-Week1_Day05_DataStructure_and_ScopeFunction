package Day5.HW5

fun main() {

    // ## Part II - Practice with Lists and Sets.


    print("\n## Part II - Practice with Lists and Sets.\n\n")

    println("-----------------------------------------------------------------------------------------------------------")

    Q1()

    println("-----------------------------------------------------------------------------------------------------------")
    println(" \n \n \n")


    println("-----------------------------------------------------------------------------------------------------------")

    Q2()

    println("-----------------------------------------------------------------------------------------------------------")
    println(" \n \n \n")


    println("-----------------------------------------------------------------------------------------------------------")

    Q3()

    println("-----------------------------------------------------------------------------------------------------------")
    println(" \n \n \n")


}


fun Q1() {
    println("- Create a list and access it and print it, then update or add elements to it.\n")

    val students = mutableListOf<String>("Basil", "ALI", "rania")

    println(students)

    //add element
    students.add("taleb")
    println("\nAdd element : $students \n")


    //Update element

    students.forEachIndexed { index, s -> students[index] = s.lowercase() }

    println("\nUpdate element to lowercase  : ${students[1]}\n")

    // change name ali in  index 1 to name ahmed
    students[1] = "ahmed"
    println("\nUpdate element in index [1] to : ${students[1]} \n ")



    print(" list student with uppercase and split : ")

    students.forEach { it
        print(it.uppercase().split(" "))
    }
    println("")
}


fun Q2() {


    println("Create a list and access out of its bounds, then manage the array errors safety with 3 different ways\n")


    val cars = listOf("camry", "sonata", "optima")

    val index: Int = 3

    println("List of cars : $cars \n")
    println("Size lis of cars : ${cars.size} \n")


    //manage the array errors safety with 3 different ways

    //try and catch
    print("The first way : ")
    try {
        println("${cars.get(index)}\n")
    } catch (e: Exception) {
        println("you dont have that index $index\n")
    }


    print("The second way : ")
    val secondWay: String? = cars.getOrNull(index)
    println("$secondWay \n")



    print("The third way : ")
    println(cars.getOrElse(index) { "you dont have that index $it\n" })

}


fun Q3() {

    //Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values
    println(
        "Create a list then add repetitive and unique elements to it, then convert it to set," +
                "\n then add new elements to it and print the set values\n"
    )


    val number = mutableListOf<Int>(1, 1, 1, 2, 2, 2, 3, 3, 3)

    println("lis of number : $number \n")


//convert to set and print all element in set

    println("set of number :${number.toSet()} \n")


    //add element by index and print it
    number.add(0, 0)
    println("add element 0 in index [0] :${number.toSet()} \n")


}
