

/* Part I - with Scope Functions.
---
- Create a working example withing 'Let'
- Create a working example withing 'Run'  (Optional to do = Bonus!!)
- Create a working example withing 'Also'  (Optional to do = Bonus!!)
*/

fun main() {


    // example withing 'Let'
    println("Example withing 'Let'\n")
    val y = mutableListOf(1, 2, 3, 4, 5).let {
        println("My List : $it")
        it.add(6)
        it.remove(1)
        println("My new List after add 6 and remove 1 $it \n")
    }

    println("----------------------------------------------------")
    println("Examples withing 'Run'")

    //examples withing 'Run'

    val fulName = mutableListOf("Bashayer", "Hasan", "Alosaimi").run {
        this[2] = "no middle name"
        println(this)
    }
    println(fulName)


    //example withing 'Also'
    println("----------------------------------------------------")
    println("Example withing 'Also'\n")

    val number2 = mutableListOf("one", "two", "three")
    number2.also {
        println(" list  before adding new one: $it")
        number2.add("four")
        println("after adding $number2")

    }
}
