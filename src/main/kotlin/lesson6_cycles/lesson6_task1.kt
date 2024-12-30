package lesson6_cycles


fun main() {

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
    println("Авторизация прошла успешно.")
}