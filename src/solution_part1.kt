fun main(){
    //Part I point 1
    val num :Int?= 451
    val x = num?.let { "$it <- This is an Integer"}  ?: "No specified number"
    println(x)
    println("-------------------------------------")
    //Part I point 1, 2
    var msg : String? = null
    msg?.let { println("The message is $msg") } ?: run { println("The message was null. Setting default value to: ")
        msg = "Kotlin"}
    println(msg)
    println("-------------------------------------")


}




