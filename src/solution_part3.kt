Write an answer to this question:
What are the cases that I need to use the map for??
//______??
The kotlin map is one of the features, and it’s the generic collection interface.
It is used for to store the elements in the key-value pairs
like:
Information students in school



What is the difference between immutable and read only variables?
//_______??
Mutable: means that the variable can be reassigned to a different value after initial assignment.
Read-only: means that the variable cannot be reassigned once initialized.
Immutable: is an object/variable whose state cannot be modified after it is created;
 that’s not true with val fields: as stated in the Kotlin Reference
 val is intended to define read-only
, in other words “values”, while var is used for mutable variables.



Create a map of 20 elements of strings and doubles
//_______??
    var map = HashMap<String,double >(20)