 fun main() {
    //###_____________________Scope Functions.____________________________###
    //Create a working example withing 'Let'
    //"Let" Execute from operation (within block), value is passed as an argument
    // and then returns the output of this execution and save


    val UpperCaceString = listOf("ali", "mohammed", "nadia").first().let {

        it.uppercase()
    }
    println("the first element in list : $UpperCaceString")


    //Create a working example withing 'Run'
    val string = listOf("ali", "mohammed", "nadia").run {

        this.first()
        println(this)
    }
    println(string) //does not save operations "run"


    //Create a working example withing 'Also'

    val str = "abc"

    val result = str.also {

        println(it + "\u00A9") // => abc©

    }
    println(result)//save just contain "str" val not save operation "also" //print:abc


}
