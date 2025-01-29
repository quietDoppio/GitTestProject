package lesson17_getter_setter

fun main() {
    val userAccount = UserAccount("Лотрик", "123456789")
    println(userAccount.password)
    userAccount.password = "000000"

    userAccount.login = "Лориан"
    println(userAccount.login)
}

class UserAccount(
    private var _login: String,
    private var _password: String,
) {
    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин был изменен")
        }
    var password: String
        get() = "*".repeat(_password.length)
        set(value) = println("Вы не можете изменить пароль")
}