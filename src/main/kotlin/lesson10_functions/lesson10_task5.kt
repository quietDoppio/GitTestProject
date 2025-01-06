package lesson10_functions

const val USER_NAME = "NAME"
const val USER_PASSWORD = "PASSWORD"
const val TOKEN_LENGTH = 32

fun main() {
    print("Введите логин: ")
    val userName = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    val token = authenticate(userName, userPassword)
    val listOfGoods = getShoppingCart(token)
    println(listOfGoods)
}

fun authenticate(userName: String, userPassword: String): String? {
    return if (userName == USER_NAME && userPassword == USER_PASSWORD) generateToken()
    else null
}

fun generateToken(): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..TOKEN_LENGTH)
        .map { chars.random() }
        .joinToString("")
}

fun getShoppingCart(token: String?): List<String>? {
    if (token == null) {
        println("Неправильный логин или пароль. В доступе отказано.")
        return null
    }
    return listOf("Шоколадка", "Тапочки", "Кружка")
}