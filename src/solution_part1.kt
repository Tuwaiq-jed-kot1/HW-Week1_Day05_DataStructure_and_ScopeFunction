fun main(){
// ## Part I - with Scope Functions.

//Create a working exmaple withing 'Run' (Optional to do = Bonus!!)
//Create a working exmaple withing 'Also' (Optional to do = Bonus!!)

    fun main() {
        //Create a working exmaple withing 'Let'
        println("Please enter your name:")
        val enteredName: String? = readLine()
        val greetingTheUser = enteredName?.let {
            if (it.isEmpty()) {
                "is Empty"
            } else "Hi $it"
        }
        println(greetingTheUser)
        println("Thank you for using this \"readLine()\" \"Let\" piece of code")

    }
}