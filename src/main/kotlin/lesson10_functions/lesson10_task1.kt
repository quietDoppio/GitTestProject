package lesson10_functions

fun main() {
    fun throwTheDice(): Int = (1..6).random()

    val computerDigit = throwTheDice()
    println("Компутер выбросил $computerDigit")

    val humanDigit = throwTheDice()
    println("Люди выбросили $humanDigit")

    when {
        computerDigit > humanDigit -> println("Люди обречены")
        humanDigit > computerDigit -> println("Жестянки повержены")
        else -> println("Победила дружба")
    }
}