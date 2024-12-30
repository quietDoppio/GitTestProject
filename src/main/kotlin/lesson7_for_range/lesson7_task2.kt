package lesson7_for_range

fun main() {
    val codeRange = 1000..9999
    var newAuthorizeCode = codeRange.random()
    println("Ваш код авторизации: $newAuthorizeCode")

    print("Пожалуйста, введите ваш код авторизации: ")
    do {
        val userEnteredCode = readln().toInt()
        if (userEnteredCode != newAuthorizeCode) {
            newAuthorizeCode = codeRange.random()
            println("Ваш код авторизации: $newAuthorizeCode")
            print("Пожалуйста, введите ваш код авторизации: ")
        }
    } while (newAuthorizeCode != userEnteredCode)
    println("Добро пожаловать!")
}