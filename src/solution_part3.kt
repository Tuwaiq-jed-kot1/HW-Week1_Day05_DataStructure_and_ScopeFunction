fun main(){
    println(
        "## Part III - Practice with Maps.\n" +
                "---\n" +
                " Write an answer to this question:\n"+
                "\nQ1-What are the cases that I need to use the map for??\n" +
                "A1- One of the cases we use map for is when we have list of students with their ids.\n"+
                "\nQ2- What is the difference between immutable and read only variables?\n"+
                "A2-Read only mean when you assign variable you can't reassign it.\n   Immutable mean you can't modify the values you put in your variable.")



    println("--------------------------------\n\n\n\n")


    println("- Create a map of 20 elements of strings and doubles\n")
    val studentsGrades : Map <String,Double> = mapOf(
        "Ahmad" to 95.2,
        "Kalid" to 72.3,
        "Mohammad" to 67.4,
        "Sami" to 86.0,
        "Abdulaziz" to 59.9,
        "Ibrahim" to 77.6,
        "salim" to 99.9,
        "Fahad" to 100.0,
        "Enad" to 66.7,
        "Omar" to 99.9,
        "Hamed" to 82.5,
        "Abdullah" to 87.2,
        "Obaid" to 60.0,
        "Nassir" to 100.0,
        "Moataz" to 93.8,
        "Basim" to 74.8,
        "Meshal" to 97.2,
        "Abdulrahman" to 63.9,
        "Anas" to 100.0,
        "Mosa" to 64.4
    )
    println(studentsGrades)

}