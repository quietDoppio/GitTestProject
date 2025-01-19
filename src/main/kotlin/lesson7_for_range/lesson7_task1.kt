package lesson7_for_range

fun main() {
    val passwordRange = 1..6
    val charRange = 'a'..'z'
    val numRange = 0..9
    var generatedPassword = ""

    for (i in passwordRange) {
        if (i % 2 == 0) generatedPassword += charRange.random()
        else generatedPassword += numRange.random()
    }
    println(generatedPassword)
}