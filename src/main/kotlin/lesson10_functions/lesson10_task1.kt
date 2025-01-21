package lesson10_functions

fun main() {
    val computerDigit = throwTheDicee()
    println("Компутер выбросил $computerDigit")

    val humanDigit = throwTheDicee()
    println("Люди выбросили $humanDigit")

    when {
        computerDigit > humanDigit -> println("Люди обречены")
        humanDigit > computerDigit -> println("Жестянки повержены")
        else -> println("Победила дружба")
    }
}

fun throwTheDicee(): Int = (1..6).random()
