package lesson7_for_range

fun main() {
    val passwordRange = 1..6
    var generatedPassword = ""

    for (i in passwordRange) {
        if (i % 2 == 0) generatedPassword += ('a'..'z').random()
        else generatedPassword += (0..9).random()
    }
    println(generatedPassword)
}