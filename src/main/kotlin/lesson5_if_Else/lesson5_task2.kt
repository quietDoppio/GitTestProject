package lesson5_if_Else

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2024

    print("Год рождения пользователя: ")
    val userYearOfBirth = readln().toInt()

    if (currentYear - userYearOfBirth >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на начальный экран")

}