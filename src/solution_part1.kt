//## Part I - with Scope Functions.
//Create a working exmaple withing 'Let'
//Create a working exmaple withing 'Run' (Optional to do = Bonus!!)
//Create a working exmaple withing 'Also' (Optional to do = Bonus!!)

fun main(){
//Create a working exmaple withing 'Let'
    var x: Int? = 1
    var result = x?.let { x + 3 }?: -1
    println(result)
//Create a working exmaple withing 'Run' (Optional to do = Bonus!!)
//Create a working exmaple withing 'Also' (Optional to do = Bonus!!)
    var i = 0
    fun getSquaredI() = (i * i).also { i++ }
    println(getSquaredI())
    println(getSquaredI())
    println(getSquaredI())
}