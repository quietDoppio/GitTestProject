package lesson10_functions

const val MIN_LINE_LENGTH = 4
fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    val result = "Добро пожаловать".takeIf { measureTheLine(userLogin, userPassword) }
        ?: "Логин или пароль недостаточно длинные"

    println(result)
}

fun measureTheLine(login: String, password: String): Boolean {
    return when {
        (login.length < MIN_LINE_LENGTH || password.length < MIN_LINE_LENGTH) -> false
        else -> true
    }
}