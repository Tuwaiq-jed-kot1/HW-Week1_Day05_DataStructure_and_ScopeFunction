fun main(){



    println("This map represents the top20 series ratings at IMDb \u272D")
    println("---------------------------------------------------------")
    var series = mutableMapOf<String, Double>(
        "Planet Earth II" to 9.5,
        "Planet Earth" to 9.4,
        "Breaking Bad" to 9.4,
        "Band of brothers" to 9.4,
        "Chernboy" to 9.3,
        "The wire" to 9.3,
        "Blue Planet II" to 9.3,
        "Out Planet" to 9.2,
        "Cosmos: A space time" to 9.2,
        "Avatar" to 9.2,
        "Cosmos" to 9.2,
        "Game of Thrones" to 9.2,
        "The Sopranos" to 9.2,
        "Rick and Morty" to 9.1,
        "The World at War" to 9.1,
        "The Last Dance" to 9.1,
        "Life" to 9.1,
        "Hagane no renkinjustsushi" to 9.0,
        "Sherlock" to 9.0,
        "The Vietnam War" to 9.0
    )
    println(series.entries)



}