package lesson11_classes

fun main() {
    val newUser2 = User2(
        2,
        "Vlad",
        "1234d8",
        "vladCoolBoy@ya.ru",
    )
    newUser2.printInfo()
    newUser2.enterBio()
    newUser2.changePassword()
    newUser2.printInfo()
}

class User2(
    private var userId: Int,
    private var userLogin: String,
    private var userPassword: String,
    private var userEmail: String,
    private var userBio: String = "",
) {

    fun printInfo() {
        println("$userId; $userLogin; $userPassword; $userEmail; $userBio")
    }

    fun enterBio() {
        print("Введите информацию о себе: ")
        userBio = readln()
    }

    fun changePassword() {
        print("Введите ваш пароль: ")
        val enteredPassword = readln()

        if (enteredPassword == userPassword) {
            print("Введите новый пароль: ")
            userPassword = readln()
            println("Пароль успешно изменён.")
        } else {
            println("Пароль введён неверно.")
        }
    }
}