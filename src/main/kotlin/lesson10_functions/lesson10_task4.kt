package lesson10_functions

const val HUMAN_VICTORY_NUM = 0
const val COMP_VICTORY_NUM = 1
const val DRAW_NUM = 2

fun main() {
    var numberOfVictories = 0
    var isPlayAgain: String
    do {
        val gameResult = playGame()
        when (gameResult) {
            HUMAN_VICTORY_NUM -> {
                println("Победа людей!")
                numberOfVictories++
            }
            COMP_VICTORY_NUM -> println("Победа машин!")
            DRAW_NUM -> println("Ничья!")
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        isPlayAgain = readln()
    } while (isPlayAgain.equals("да", ignoreCase = true))
    println("Кол-во побед людей: $numberOfVictories")
}

fun throwTheDice(): Int = (1..6).random()

fun playGame(): Int {
    val humanDigit = throwTheDice()
    println("Люди выбросили $humanDigit")
    val computerDigit = throwTheDice()
    println("Компутер выбросил $computerDigit")
    return when {
        (humanDigit > computerDigit) -> HUMAN_VICTORY_NUM
        (computerDigit > humanDigit) -> COMP_VICTORY_NUM
        else -> DRAW_NUM
    }
}

