package lesson5_if_Else

fun main() {
    val firstSummand = 100
    val secondSummand = 80
    val multiplayer = 2

    val correctAnswer = 100 + 80 * 2

    print("Решите задачу что бы мы знали что вы не робот: $firstSummand + $secondSummand * $multiplayer = ")

    val userDigit = readln().toInt()

    when (userDigit) {
        correctAnswer -> println("Добро пожаловать!")
        else -> println("Доступ запрещён")
    }
}