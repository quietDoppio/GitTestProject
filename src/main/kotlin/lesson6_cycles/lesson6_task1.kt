package lesson6_cycles


fun main() {

    print("Регистрация\nВведите никнейм: ")
    val newClientUserName = readln()
    print("Введите пароль: ")
    val newClientPassword = readln()

    var logInUserName = false
    var logInPassword = false

    println("Вход")
    while (!logInPassword || !logInUserName) {
        print("Введите никнейм: ")
        logInUserName = readln() == newClientUserName
        print("Введите пароль: ")
        logInPassword = readln() == newClientPassword
        if (!logInPassword || !logInUserName) print("Неверные данные, попробуйте сова\n")
    }
    println("Авторизация прошла успешно.")
}