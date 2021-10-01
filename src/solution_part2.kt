
    //## Part II - Practice with Lists and Sets.
    fun main() {

        //Create a list and access it and print it, then update or add elements to it
        //Create
        val mutableL: MutableList<String> = mutableListOf("SAMI ", "ahmed ")
        //Access:
        mutableL.forEach {print(it)}
        println("\n")
        //Update:
        println("First element before updating: "+mutableL[0])
        mutableL[0] = mutableL[0].lowercase()
        println("after performing \"lowercase()\": "+mutableL[0])
        println("")
        println("Second element before updating: "+mutableL[1])
        mutableL[1] = mutableL.get(1).uppercase()
        println("after performing \"uppercase()\": "+mutableL[1])

        //adding an element:
        mutableL.add(2,"Abdullah")
        mutableL.forEach {print(it)}
        //END of: list part.


        //Create a list and access out of its bounds, then manage the array errors safety with 3 different ways
        //create
        var mutableList2 = listOfNotNull(100,200)

        //1st way
        if (mutableList2[2]!= null) {
            println(mutableList2[2])
        } else {
            println("Element doesn't exist")
        }

        //2nd way:
        try {
            println(mutableList2[2])
        } catch(e:Exception) {
            println("Message from system: ${e.localizedMessage}")
        }finally{
            println(" Thank you for using our piece of code")
        }

        //3rd way:
        //println(mutableList2[2]){it = }?:
        //println(mutableList2[2]){}?:
        //ran out of time

        //Create a list then add repetitive and unique elements to it, then convert it to set, then add new elements to it and print the set values

    }



