fun main(){
    println("Question 1\n")

    val days= mutableListOf("Sun", "Mon", "Tue")

    println(days)
    days.add("Wed") //update1
    days.add("Thu") //update2
    println(days)
    println(days[0])
    days.forEachIndexed{index, day -> days[index] = day.uppercase().trim()} //update3
    println(days)
    days.remove("WED") //update4
    println(days)


    println("--------------\nQuestion 2\n")

    val oddNumbers: List<Int?> = listOf(1,2,3)
    val check:Int? = oddNumbers.getOrNull(4)

    //check 1
    if (check == null){
        println(("it is null"))
    }else {
        println(check)
    }

    //check 2
    when(check){
        null -> println("it is null")
        else -> println(check)
    }

    //check 3
    try {
       check!!.plus(100)
    }catch (e:Exception){
        println("it is null")
    }


    println("--------------\nQuestion 3\n")

    val ID = mutableListOf(0,1,2,2,3,3,3,4,5,5)
    println(ID)
    println(ID.toSet())
    ID.add(6)
    println(ID)











}