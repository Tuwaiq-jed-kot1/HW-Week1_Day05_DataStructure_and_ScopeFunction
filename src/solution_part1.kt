fun main(){

    //>>>>>>>>>>> Create a working exmaple withing 'Let'

    val calculator  = listOf(100,200,300)[2].let { it + it }

    println(calculator)
    println()  // just to make space

    //>>>>>>>>>>> Create a working exmaple withing 'Run' (Optional to do = Bonus!!)

    val number = listOf(100,200,300).first().run { 400 }
    println(number)
    println() // just to make space

   //>>>>>>>>>>> Create a working exmaple withing 'Also' (Optional to do = Bonus!!)
    val list1 = mutableListOf(100,200,300,400)
    println(list1)
    println() // just to make space

        list1
        .also{println("Adding a new value")}
        .add(500)
        .also({println("Final list : $list1")})
}