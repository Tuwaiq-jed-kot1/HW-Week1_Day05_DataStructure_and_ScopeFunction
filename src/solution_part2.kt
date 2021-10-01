//## Part II - Practice with Lists and Sets.

//1- Create a list and access it and print it, then update or add elements to it
fun main() {
   val n = mutableListOf("rana", "sara" , "jaber")
      println(n[2])
  n.add("ahad")
   println(n) }

//2- Create a list and access out of its bounds, then manage the array errors safety with 3 different ways

//exception1
fun main (){
    val v = mutableListOf(1, 2, 3, 4)
    val n = 4
    if(n > v.size-1 ){println("you are out of range")}
    else{
        println("your n : ${v[n]}")
    }}

//exception2
fun main() {
       val v: List<String> = mutableListOf("rana ", "sara")
      print(v.getOrElse(3) {
         "you dont have index"
       })
  }

//exception3

fun main  () {
    val listCheck = mutableListOf<Int>()

    val n = 8
    val v = 0
    var c : Int

    try {
        c = n/v
    } catch (e : Exception){
        println(" error is handled")
    }
}


//3- Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values
fun main(args: Array<String>) {
     val nlist = mutableListOf( 4, 1, 1, 25, 3 ,3 , 3)
       nlist .add(18)
      val nset= nlist.toSet()
      println("Set : $nset")
   }

