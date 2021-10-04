
fun main(){
    val mylist:MutableList<Int> = mutableListOf(1,2,3,4,5)
    val otherList:List<Int> = mylist.toList()

    mylist[0] = 7

    println(mylist) // the changed has been add to the mylist
    println(otherList)// dose not contain any of the changes afterwords

    println("ــــــــــــــــــــ")


    // method in list to add and print out the list
    val lists:MutableList<String> = mutableListOf("apple","orange","mango")
    lists+="kiwi"
    print(lists[1]+"\n")
    print(lists)

    // method 1 of Bound
    lists.getOrElse(6){
        println("\n" + "there is no index $it") //default value in cases when the index is out of bound
    }

    print( "\n" + "ــــــــــــــــــــ")

    // method 2 of Bound

    val list:String? =lists.getOrNull(5) //nullable method // the output null
    print("\n"+ list)

    print("\n"+"ــــــــــــــــــــ")

    // method 3 of bound

    val cities: List<String?> = listOf("Kolkata", null, "Mumbai")
    var name: List<String?> = emptyList()
    for (city in cities) {
        city?.let { name = name.plus(it) }
    }
    print("\n"+name)


    print("\n"+"ــــــــــــــــــــ")

    // repetitive and unique element and convert ot to set

    var numbers:List<Int> = mutableListOf(1,2,1,3,4)
    numbers+= 5
    var myset = numbers.toSet()

    println("\n"+"set : ${myset}")



}
