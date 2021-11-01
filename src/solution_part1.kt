fun main(){

//q1

    println("q1")
    println("enter any name")
    val namee: String? = readLine()
    val output = namee?.let {it.uppercase()} ?: println("null!")
    println(output)
    println()
    println("*************************************************************")
    println()


//p2
    println("q2")
    fun test2() {


        val phoneNumber = "0547985969"
        phoneNumber.also { number ->
            println(number.contains("7"))
            println(number.length)
        }

    }
    test2()
    println()
    println("*************************************************************")
    println()
//q3
    println("3")
    fun test3() {


        var statuss = "on"

        run {
            val statuss = "off"
            println(statuss) // off
        }
        println(statuss)  // on
    }
    test3()
    println()
    println("*************************************************************")
    println()
}