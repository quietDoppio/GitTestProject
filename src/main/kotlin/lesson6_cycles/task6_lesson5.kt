package lesson6_cycles


fun main() {
    val digitsToCalculateRange = 1..9

    print("Регистрация\nВведите никнейм: ")
    val newClientUserName = readln()
    print("Введите пароль: ")
    val newClientPassword = readln()

    println("Вход")
    do {
        print("Введите никнейм: ")
        val logInUserName = readln() == newClientUserName
        print("Введите пароль: ")
        val logInPassword = readln() == newClientPassword
        if (!logInPassword || !logInUserName) print("Неверные данные, попробуйте сова\n")
    } while (!logInPassword || !logInUserName)

    println("Нужно убедиться что вы не бот")
    var attempts = 3
    while (attempts != 0) {
        val firstDigit = digitsToCalculateRange.random()
        val secondDigit = digitsToCalculateRange.random()
        val correctAnswer = firstDigit + secondDigit

        print("Решите задачу: $firstDigit + $secondDigit = ")
        val userAnswer = readln().toInt()

        if (correctAnswer == userAnswer) {
            println("Добро пожаловать!")
            break
        }
        println("Неверно. Осталось попыток: ${--attempts}")
    }
    if (attempts == 0) {
        println("Доступ запрещён.")
    }

}