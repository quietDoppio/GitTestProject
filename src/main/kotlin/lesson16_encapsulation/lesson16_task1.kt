package lesson16_encapsulation

fun main() {
    val dice = Dice()
    dice.getDiceNumber()
}

class Dice(
    private val diceNumber: Int = (1..6).random()
) {
    fun getDiceNumber() = println(diceNumber)
}