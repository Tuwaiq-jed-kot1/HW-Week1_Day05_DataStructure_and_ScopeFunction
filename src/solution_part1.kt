

fun main() {

//    ## Part I - with Scope Functions.

    println("\n## Part I - with Scope Functions.\n")

    println("-----------------------------------------------------------------------------------------------------------")

    let()

    println("-----------------------------------------------------------------------------------------------------------")
    println(" \n \n \n")


    println("-----------------------------------------------------------------------------------------------------------")

    run()

    println("-----------------------------------------------------------------------------------------------------------")
    println(" \n \n \n")


    println("-----------------------------------------------------------------------------------------------------------")

    also()

    println("-----------------------------------------------------------------------------------------------------------")
    println(" \n \n \n")


}


fun let() {


    //Create a working exmaple withing 'Let'

    println("- Create a working exmaple withing 'Let'\n")

    println("Please enter your name : ")

    var name: String? = readLine()!!

    var helloName = name?.let {
        if (it.isEmpty()) {
            "isEmpty"
        } else {
            "Hello  $it"
        }
    }

    println(helloName)

}


class Person {
    var name: String = "ALBAILS "
    var age: Int = 26
}


fun run() {

    println("- Create a working exmaple withing 'Run'.\n")

    val person: Person? = Person()

    val bio = person?.run {
        println(name)
        println(age)

        age + 5

        "its worikg"
    }

    println(bio)


}


fun also() {

    println("- Create a working exmaple withing 'Also'.\n")

    val numbers = mutableListOf(1, 2, 3)

    val duplicatNumbers = numbers.also {

        println("The list element are : $it")
        println("The size list : ${it.size}")

        it.add(4)

        println("The list after adding an element : $it")
        println("The size list after adding : ${it.size}")



        it.removeAt(0)
        println("The list after remove #index 0 :$it")


    }


}