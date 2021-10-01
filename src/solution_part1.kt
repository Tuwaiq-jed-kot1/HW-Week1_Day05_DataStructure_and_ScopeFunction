fun main(){

    println("## Part I - with Scope Functions. \n- Create a working exmaple withing 'Let'")

    val x = setOf("ahmad","khalid","mohammad").last().let { it.length }
    println("The last name length is $x")

}


