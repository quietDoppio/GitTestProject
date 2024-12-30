package lesson6_cycles

fun main() {
    val digitsRange = 1..9
    val digitToGuess = digitsRange.random()
    var attempts = 5

    do {
        print("Введите число: ")
        val userAnswer: Boolean = readln().toInt() == digitToGuess
        when (userAnswer) {
            true -> {
                println("Это была великолепная игра!")
                break
            }
            false -> {
                println("Неверно! Осталось попыток: ${--attempts}")
                if (attempts == 0) println("Было загадано число $digitToGuess")
            }
        }
    } while (attempts > 0 || userAnswer)


}