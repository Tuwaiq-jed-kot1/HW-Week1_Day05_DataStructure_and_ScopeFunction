fun main() {

    var uppercaseName = enteredName()

    var names = mutableListOf<String>("heba", "nada", "shatha")
    //Create a working exmaple withing 'Run' (Optional to do = Bonus!!)

    names.getOrNull(5).run {
        if (!this.isNullOrEmpty()) {
            println(this.uppercase())
        }
    }

//Create a working exmaple withing 'Also' (Optional to do = Bonus!!)
    names[1].also { name ->
        names[1] = name.uppercase()
    }

    //println(names[1])
}

//Create a working exmaple withing 'Let'
fun enteredName(startMsg: String = "Please, "): String {
    println("$startMsg enter your name : ")
    //Create a working exmaple withing 'Let'
    val name = readLine()?.trim().let { Name ->
        if (Name!!.isNotEmpty()) {
            Name.uppercase()
        } else enteredName("You should")
    }
    return name
}