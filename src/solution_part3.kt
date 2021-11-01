fun main(){

//q1
    //   Write an asnwer to this question: What are the cases that I need to use the map for??

    println("there too many uses for the map in the real life and i will mention a few of them:\n" +
            "\n" +
            "     1.connecting the phone number with the name of their owners in the contacts in any phone.\n" +
            "     2.mapping each ID number with it holder citizen\n" +
            "     3.for the products in te market it can be peared with it prices")

//q2
    //What is the difference between immutable and read only variables?

    println("the difference is that immutable have the ability to be re-assigned but so when you change a value inside it it will reference to other new variable , the read-only whenever it declared it cannot be re-assigned but you have the ability to change the data inside it")


//q3
    /*Create a map of 20 elements of strings and doubles*/



    var map1 = mutableMapOf(
        "Abbas" to 1.5,
        "Abd al-Rashid " to 12.7,
        "badr" to 4.3,
        "Danial" to 6.0,
        "Essa" to 22.05,
        "Fadi" to 1.12,
        "Gabr" to 3.23,
        "Haamid" to 45.2,
        "Hakeem" to 14.30,
        "Hakim" to 34.60,
        "Ibrahim " to 11.10,
        "Ibtihaj" to 15.60,
        "Ihab" to 13.06,
        "Jabril" to 19.50,
        "Jafar" to 133.50,
        "Jalal" to 12.10,
        "Jalil" to 55.70,
        "Karam" to 44.40,
        "rana" to 9.64,
        "mohammed" to 21.56,
        "ahmed" to 19.60
    )

    println(map1.entries)
    println(map1)

    println("All keys: ${map1.keys}")
    println("All values: ${map1.values}")
}