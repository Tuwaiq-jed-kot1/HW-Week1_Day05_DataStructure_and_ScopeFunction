//## Part III - Practice with Maps.

//1- Write an asnwer to this question: What are the cases that I need to use the map for??

Map is an interface and generic collection of elements that holds data in the form of key and value pair.
ex: House Numbering System : we give unique number to each building in a street or area to locate a particular building in easy way

//2- What is the difference between immutable and read only variables?
value of mutable variables can be changed at anytime after initialized,
while variables defined with val are immutable(Read only) it can be initialized only one time (you can not change value of immutable(read only) variables.)

//3- Create a map of 20 elements of strings and doubles

fun main(args: Array<String>) {
    var map = HashMap<String, Double>(20)

    map.put("rose" , 10.0)
    map.put("tulip" , 11.6)
    map.put("oak" , 12.0)
    map.put("sunflower" , 19.0)
    map.put("poppy" , 1.0)
    map.put("orchid" , 15.9)
    map.put("daffodil" , 6.0)
    map.put("carnation" , 9.0)
    map.put("crocus" , 4.0)
    map.put("primrose" , 18.7)
    map.put("waterlily" , 5.0)
    map.put("pansy" , 33.0)
    map.put("dahli" , 87.0)
    map.put("aster" , 17.0)
    map.put("bellflower" , 3.1)
    map.put("camellia" , 35.0)
    map.put("iris" , 55.0)
    map.put("jasmine" , 24.1)
    map.put("lavender" , 44.0)
    map.put("dandelion" , 80.0)


    for(key in map.keys) {
        println("Element at key $key : ${map[key]}")
    }}