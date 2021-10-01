import kotlin.random.Random

fun main() {
    // Question 1 : What are the cases that I need to use the map for??
    /*
    Answer Q1 : For example if I want to make a Sign-up for an Application and my Inputs are = Username , Password
    The Username is unique each user must have unique username or then people can access each other accounts
    The password is not unique multiple users could end up having the same password ,
    but it's linked to a certain username , so you need both to log in to your user account
    finally I need to make the Username the key and map their password values to their account username
     */

    // Question 2 : What is the difference between immutable and read only variables?
    /*
    Answer Q2 :
    Read-only =  if you have a val collection , Read-only prevents you from reinitializing the collection variable , but
    you still can alter the data or add inside the val collection
    Immutable = Immutable is property of the object/variable itself for example : the String doesn't allow you to modify
    after crating it ,so what happens when you modify it , it actually crates a new String and return that to you
    thus means a new referenced String not the old one
    : note : in kotlin val is actually a read-only not Immutable as people think
     */

    // Question 3 : I used for loop to crate a Mutable Map instead of repeating the code
    val ourMap: MutableMap<String, Double> = mutableMapOf()
    for (index in 1..20) {
        // I Tried to give the values and keys distinct values by using Random for Double ,
        // but for String I searched the web and found this Random algorithm for simple Random String
        ourMap.put(('A'..'Z').map { it }.shuffled().subList(0, 6).joinToString(""), Random.nextDouble(30.0))
    }
    println(ourMap.entries)
}