package lesson7_for_range

fun main() {
    val listOfRanges = listOf('a'..'z', 'A'..'Z', 0..9)
    var userPasswordRange: IntRange
    var generatedPassword = ""

    do {
        print("Введите количество символов для вашего пароля не менее чем 6: ")
        userPasswordRange = 1..readln().toInt()
    } while (userPasswordRange.last < 6)

    for (i in userPasswordRange) {
        val index = listOfRanges.indices.random()
        generatedPassword += listOfRanges[index].toSet().random()

    }
    println(generatedPassword)


}
