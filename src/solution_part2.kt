fun main(){
/*

## Part II - Practice with Lists and Sets.

- Create a list and access it and print it
 */

      val shopStore = mutableListOf (
      "Dress",
      "jeans",
      "jackets",
      "shoes",
      "bags",)//end of list
      println("the shop sell $shopStore")
    // then update or add elements to it
      shopStore.add("the jewellery")
      println("the new is $shopStore")

  // Create a list and access out of its bounds.

      val plants = mutableListOf (
            "Mercury",
            "Venus",
            "Earth"  ,
            "Mars" ,
            "Jupiter" ,
            "Saturn" ,
            "Uranus" ,
            "Neptune" ,
      )
      print(plants)
      print(plants.getOrElse(9) { "sun " })
// then manage the list errors safety with 3 different ways
      // first one


      // second  way




      // third  way


}//end of cary