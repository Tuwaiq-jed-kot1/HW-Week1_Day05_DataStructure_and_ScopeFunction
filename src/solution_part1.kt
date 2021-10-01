fun main(){
    //Part1

    //---------------------------------------------------------------------

    //Using Let

    val name:String = "I used Let Properly"
    val useLet = name.let { it }
    println(useLet)

    //Using Run

    val name2:String = "I used Run Properly"
    val useRun = name2.run { "I used Run Properly" }
    println(useRun)

    //Using Also

    val name3:String = "I used Also Properly"
    val useAlso = name3.also { it }
    println(useAlso)

}