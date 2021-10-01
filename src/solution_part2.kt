fun main(){
//q.1 and question 3
val idNumber = mutableListOf(11,54,34)
    println(idNumber)
idNumber.add(56)
    println(idNumber)
idNumber.add(11)
println(idNumber)
val idNumberSet =   idNumber.toSet()
    println(idNumberSet)


//q,2
val number= listOf(1,2,3)

    try {
        println(number[5])

    }catch (e:Exception){
        println("out of bound")

    }
}







