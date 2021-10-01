fun main(){

    val stuNames = mutableListOf<String>("Maryam","Sara","Hind","Nora")
    // ALSO return the object with changes
    val ilteresList=stuNames.also{
        it.add("Asmaa")
    }
    //LET
    // execute the code
    ilteresList.let{
        println("the list of students$it \n")
    }
    //RUN
    val num :Int=10
    num.run{
        for (i in 0..10) println ("$i * 10 = $this")
    }
}