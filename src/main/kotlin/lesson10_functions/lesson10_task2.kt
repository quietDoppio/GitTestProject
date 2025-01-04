package lesson10_functions

const val MIN_LINE_LENGTH = 4
fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    measureTheLine(userLogin, userPassword)
}

fun measureTheLine(login: String, password: String) {
    if (login.length < MIN_LINE_LENGTH || password.length < MIN_LINE_LENGTH) println("Логин или пароль недостаточно длинные.")
    else println("Добро пожаловать.")

}