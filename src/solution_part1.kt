fun main(){
// Let


    val x= listOf(1,2,3).first().let {
        it+it
    }


    // Run


    val y= listOf(1,2,3).last().run {

        this*this
    }

    //also

    val fruits = mutableListOf("apple", "kiwi", "banana")
    fruits
        .also { println("The list elements before adding new one: $it") }
        .add("mango")

    println(x)
    println(y)
}