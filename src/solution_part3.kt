import Day5.HW5.Q1
import Day5.HW5.Q2
import Day5.HW5.Q3

fun main(){





    // ## Part III - Practice with Lists and Sets.


    print("\n## Part III - Practice with Maps.\n\n")

    println("-----------------------------------------------------------------------------------------------------------")

    map()


    println("-----------------------------------------------------------------------------------------------------------")
    println(" \n \n \n")

}






fun map(){


    println("Create a map of 20 elements of strings and doubles \n")

    for (i in 1..20) {

        val students = mutableMapOf<String, Double>("Developrs " to i.toDouble(),)
        print(" ${ students.entries }")


        if (i == 5 || i == 10 || i == 15) { print("\n\n") }

    }

    println("\n\n")


}