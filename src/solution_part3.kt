fun main(){

   /* ## Part III - Practice with Maps.
    ---
    - Write an asnwer to this question: What are the cases that I need to use the map for??
     The Map provides key-based access using a type that you specify.
     Keys are unique and identify the values in the map; the values,
     on the other hand, do not need to be unique. In this way,
      Map shares another feature with Set: The keys of a map are guaranteed to be unique,
      just like the elements of a set.

    - What is the difference between immutable and read only variables?
     Mutable means that the variable can be reassigned to a different value after initial assignment
     and To declare a mutable variable, you use the var keyword.

    Read only means that the variable cannot be reset once initialized.
    You should prefer read-only variables to mutable variables whenever possible.
    A read-only variable can be declared with val (instead of var)

    - Create a map of 20 elements of strings and doubles*/
       var plants =mutableMapOf(
        "Mercury" to 1,
        "Venus" to 2 ,
        "Earth" to 3 ,
        "Mars" to 4,
        "Jupiter" to 5,
        "Saturn" to 6,
        "Uranus" to 7,
        "Neptune" to 8,
           )
       print(plants)







}