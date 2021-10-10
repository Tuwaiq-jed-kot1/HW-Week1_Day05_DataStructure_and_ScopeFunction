




// Part I - with Scope Functions

// Create a working exmaple withing 'Let'
//akes the object it is invoked upon as the parameter and returns
// the result of the lambda expression.
//Kotlin let is a scoping function wherein the variables declared
// inside the expression cannot be used outside. An example demonstrating
// kotlin let function is given below.

fun main (args: Array<String>) {

   var str = "Hello World"
    str.let { println("$it!!") }
    println(str)
}


