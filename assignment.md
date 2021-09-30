# Kotlin Essentials (Data Structure /Scope Functions)
---
The Kotlin assignment has three components
- Practice with Scope Functions.
- Practice with Lists and Sets.
- Practice with Maps.

> Note: You must save your solution as `solution_part1.kt` for Part I, `solution_part2.kt` for Part II, and `solution_part3.kt` for Part III.

## Part I - with Scope Functions.
---
- Create a working exmaple withing 'Let'
- Create a working exmaple withing 'Run'  (Optional to do = Bonus!!)
- Create a working exmaple withing 'Also'  (Optional to do = Bonus!!)
- ---------------------------

fun main(){
###//          --->>>Create a working exmaple withing 'Let'<<<---
val x = listOf(1,2,3).last().let { it * it }
println(x)

###    //          --->>>Create a working exmaple withing 'Run' (Optional to do = Bonus!!)<<<---
    val r = listOf(1,2,3).last().run { 5 }
    println(r)

###    //          --->>>Create a working exmaple withing 'Also' (Optional to do = Bonus!!)<<<---
    val ma = mutableListOf(1,2,3,4)
    println(ma)
        ma.add(5)
    println(ma)
        ma.also { it }
    println(ma)
    }

## Part II - Practice with Lists and Sets.
---
- Create a list and access it and print it, then update or add elements to it
- Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
- Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values
-------------------------------------------
fun main() {
###//          --->>>Create a list and access it and print it,
###//          then update or add elements to it<<<---

val lis = mutableListOf(1,2,3)
println(lis[1])
lis.add(1)
println(lis)
//          --->>>Create a list and access out of its bounds,
//          then manage the array errors safety with 3 different ways<<<---
###    //  >>>the first Exception<<<
    val lis2 = mutableListOf(1,2,3)
    println(lis2.getOrElse(4){
        "you don't have that index" })
###    //          >>>the second Exception<<<
    val lis3 = mutableListOf(1,2,3)
    val n = lis2.getOrNull(4)
    if (n == null){
        println("you out of the range")
    }else{
        println(n)
    }
###    //  >>>the third Exception<<<
    val lis4 = mutableListOf(1,2,3)
    try {
    println(lis4[4])
    }catch (e:Exception){
        println("the error is ${e.message}")
    }

       //          --->>>Create a list then add repetitive and unique elements to it, then convert it to set,
       //          then add new elements to it and print the set values<<<---
    val lis5 = mutableListOf(1,2,3)
    println(lis5)
    lis5.add(1)
    lis5.add(5)
    println(lis5)
    val lis6 = lis5.toMutableSet()
    println(lis6)
    lis6.add(7)
    println(lis6)
    lis6.add(3)
    println(lis6)
}

## Part III - Practice with Maps.
---
- Write an asnwer to this question: What are the cases that I need to use the map for??
- What is the difference between immutable and read only variables?
- Create a map of 20 elements of strings and doubles
- ----------------------------------------------------------
###
    //          --->>>Write an asnwer to this question:
    //          What are the cases that I need to use the map for??<<<---
###//## the answer is --> if we have a data and a list, and we need to use it
###// into one collection we can do it with map

    //          --->>>What is the difference between immutable and read only variables?<<<---
###    //## the answer is --> val name = ""
###    // Immutable is an object(name)  & read only it is a keyword(val)

    //          --->>>Create a map of 20 elements of strings and doubles<<<---
    fun main() {
    val m = mutableMapOf(
        1.0 to "A", 2.0 to "B",
        3.0 to "C", 4.0 to "D",
        5.0 to "E", 6.0 to "F",
        7.0 to "G", 8.0 to "H",
        9.0 to "I", 10.0 to "J",
        11.0 to "K", 12.0 to "L",
        13.0 to "M", 14.0 to "N",
        15.0 to "O", 16.0 to "P",
        17.0 to "Q", 18.0 to "R",
        19.0 to "S", 20.0 to "T"
        )
    println(m)
}
