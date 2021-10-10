// Create a working exmaple withing 'Run'
//Kotlin run is another interesting function. The following example

fun main(args: Array<String>) {
    var str = "Hello Koltin let"
    str.let { println("$it!!")}
    println(str)
    var strLength = str.let { "$it function".length}
    var strlength = ""
    println ("strlength is $strlength")
}

