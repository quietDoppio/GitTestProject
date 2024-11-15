package lesson5_if_Else

fun main() {

    print("Решите задачу что бы мы знали что вы не робот: 100 + 40 * 2 = ")
    val correctAnswer = 180

    val userDigit = readln().toInt()

    when (userDigit) {
        correctAnswer -> println("Добро пожаловать!")
        else -> println("Доступ запрещён")
    }
}