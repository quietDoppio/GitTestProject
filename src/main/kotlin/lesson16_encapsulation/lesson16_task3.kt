package lesson16_encapsulation

fun main() {
    val accountData = AccountData()
    val accessPermission = accountData.verifyUser("1234")

    if (accessPermission) println("Добро пожаловать.")
    else println("В доступе отказано.")
}

class AccountData(
    val userLogin: String = "USER",
    private val userPassword: String = "1234",
) {
    fun verifyUser(userEnter: String): Boolean {
        return when {
            userEnter == userPassword -> true
            else -> false
        }
    }
}