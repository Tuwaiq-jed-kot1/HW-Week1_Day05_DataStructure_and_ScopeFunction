
// Create a working exmaple withing 'Also'
fun main (args: Array<String>) {
    var m =1
    m= m.also { it + 1 }.also { it + 1 }
    println(m)
}