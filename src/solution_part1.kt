//  SCOPE FUNCTION PRACTICE :
data class Citizen(var name: String, var age: Int, var residence: String)

fun main (){
    val citizen1:Citizen? = Citizen("ahmad",  30 , "jeddah", )
    val citizen2 =Citizen("mohamed", 24, "makkah", )



    print("\n ــــــــ run fun ــــــــ")
    // scoping fun : run
    val total1 = citizen1?.run {
        println("\n"+" age of ${this.age} - ${age}")
        this.name.length+age+this.residence.length
    }
    print("\n"+total1)

    print("\n ــــــــ Let fun ــــــــ")

    val total2 = citizen2.let {
        println("\n"+"age of ${it.age}")
        it.age + it.residence.length + it.name.length
        // let return the last line of lambda
    }
    print(total2)


    print("\n ــــــــ Let also ــــــــ")

    val  citizenNew:Citizen =citizen2.also {
        it.age = 40
    }
    println("\n"+"new citizen age : ${citizenNew.age}")
}
