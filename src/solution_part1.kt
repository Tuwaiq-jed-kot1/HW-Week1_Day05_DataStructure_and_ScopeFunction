fun main() {

    //  ## Part I - with Scope Functions.

// - Create a working exmaple withing 'Let'
    var studentMark = 23
    println("Your mark is $studentMark out of 30 , after adding bounce you got ${(studentMark.let{it + 5 })} out of 30 ")
}

    // - Create a working exmaple withing 'Run'  (Optional to do = Bonus!!)
    var studentAttend = 23
    println(" ${(studentAttend.run{this + 5 })} out of 30 ")

  //  - Create a working exmaple withing 'Also'  (Optional to do = Bonus!!)
