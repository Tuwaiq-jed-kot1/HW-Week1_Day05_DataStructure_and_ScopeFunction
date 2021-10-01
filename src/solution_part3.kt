//## Part III - Practice with Maps.
//Write an asnwer to this question: What are the cases that I need to use the map for??

//Maps are perfect for scenarios where I have to use a key-value pair associations. The maps are used to perform lookups
//by keys or values and to updat. Several example cases are dictionaries, phone book database and data compression

//What is the difference between immutable and read only variables?

//Immutable is a data type so in kotlin you have List, Array, Map as immutable data types but these data types have
//counterpart mutable data types like MutableList, MutableArray and MutableMap.
//Read only variables in kotlin are declared using the keyword val. This prevents reassignment of new value to the variable


//Create a map of 20 elements of strings and doubles
fun main(){
    val myMap = mutableMapOf<String, Double>()

    for (i in 1..20){
        myMap.put("${'a' - 1 + i}", i.toDouble())
    }

    print(myMap)
}