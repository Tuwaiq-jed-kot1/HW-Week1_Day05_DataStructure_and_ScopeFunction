import kotlin.random.Random

fun main(){
    //Part III - Practice with Maps.
    /*
    # What are the cases that I need to use the map for??

    If we want to match items from one set with items in another set nothing better than map could do that,
    also in a lot of scenarios we need to access part of information while we have the other halve( like if we have
    a person ID, and we need to know the rest about him/her.
    Map is a great way to store the data and gives you the ability to access it this way.

    # What is the difference between immutable and read only variables?

    A ReadOnly Variable can be initialized once via constructor, then you can't add or remove items from it.
    An Immutable variable has methods to modify it like Add or Remove, but they will create a new variable and return that.

     */

    // Here I created a random map that takes Doubles as Keys and String as Values with 20 elements.

    val letters: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val randomMap = mutableMapOf<Double, String>()

    for (i in 0..19) {
        val randomString: String = List(10) { letters.random() }.joinToString("")
        val randomDouble = Random.nextDouble(0.0, 100.0)
        randomMap.put(randomDouble, randomString)
    }

    println(randomMap)

}