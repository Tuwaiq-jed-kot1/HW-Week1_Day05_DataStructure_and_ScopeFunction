//soup function "Let"
fun main() {
    //program calculates the age in hours
    println("Enter your age:")
    val age: String? = readLine()

    if(age!!.isNotEmpty()) {

        val ageWithHours = age.toDouble().let{ it*(8765.82)}
        println("Your age in hours is $ageWithHours")

    }else{ println("You Should Enter Your Age")}
}

