package lesson5_if_Else

fun main() {
    val userProfileName = "Zaphod"
    val userProfilePassword = "PanGalactic"

    print("Введите логин: ")
    val userName = readln()

    if (userName == userProfileName) {
        print("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == userProfilePassword) {
            println("Добро пожаловать на борт")
        } else {
            println("Неверный пароль")
        }
    } else {
        println("Такой учётной записи не существует. Пожалуйста зарегистрируйтесь")
    }
}