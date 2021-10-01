 //   ## part I - with scope function

    //1- Create a working exmaple withing 'Let'
    fun main() {
   val n = listOf(6, 3, 4).last().let {
      it + it
    }
    println(n) }

    //2- Create a working exmaple withing 'Run'  (Optional to do = Bonus!!)
fun main() {
        var n = listOf(6,3,4).last().run { 4 }
        println(n)
    }

 // 3- Create a working exmaple withing 'Also'  (Optional to do = Bonus!!)

 fun main(args: Array<String>) {
     val n = mutableListOf(1,2,3,4,5)
     n.add(7+8)
     n.also{println("$it")}
 }
