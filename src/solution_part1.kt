fun main() {
    // Question 1 : I used the let function on the Fahrenheit question from the Third assignment
    val f: Double = 212.0
    println("$f degree Fahrenheit is equal to ${"%.1f".format(f.let { f -> (5 * (f - 32)) / 9 })} in Celsius")
    // We reduced the lines of the code and didn't need the variable c
    // let function allowed us to do operations on the val f and keep the original value of f

    println() // to add line between Questions

    // Question 2 Optional :
    val str = "      Hello World!     ".run {
        trim() // you can do the operation as if you are in the class itself without dot(.) because this:String
        // NOTE : trim happened and returned new string , but we are dealing with this and this value didn't change later when we used it for substring
        substring(8) // it returns the last line and assign it to str , so only substring of this returned not trim&substring
    }
    println(str)

    println() // to add line between Questions

    // Question 3 Optional :
    var x = 2
    val y = (x * x).also {
        x++ // I assigned val y with (2*2) = 4  then x++ = 3 :: note :: Also doesn't return the last line as .run{} function
    }
    println("X value after also changed to = $x \nY value = $y")


}