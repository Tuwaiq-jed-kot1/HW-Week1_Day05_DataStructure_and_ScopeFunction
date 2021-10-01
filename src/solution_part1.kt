fun main() {
//## Part I - with Scope Functions.

    //Create a working example withing 'Let'
    val name:String? = "shahad"  //can be changed to null
    println( name?.let { "welcome to \'let\' $it, your name starts with an ${it.elementAt(0).uppercaseChar()}" } ?: "couldn't run \'let\', your name can't be empty")

    //Create a working example withing 'Run' (Optional to do = Bonus!!)
    name.run {
        if (this.isNullOrEmpty()) "welcome to \'run\', Please enter a valid name" else "welcome to \'run\' $this, you passed the null check"
    }.run(::println)

    //Create a working example withing 'Also' (Optional to do = Bonus!!)
    name?.also {
        println("welcome to \'also\' $it, your name reversed is: ${it.reversed()}")
    } ?: println("couldn't run \'also\', your name can't be empty")



}