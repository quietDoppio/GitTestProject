package lesson5_if_Else

fun main() {
    val user9221Name = "Zaphod"
    val user9221Password = "PanGalactic"

    print("Введите логин: ")
    val userName = readln()

    if (userName == user9221Name) {
        print("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == user9221Password) {
            println("Добро пожаловать на борт")
        } else {
            println("Неверный пароль")
        }
    } else {
        println("Такой учётной записи не существует. Пожалуйста зарегистрируйтесь")
    }
}