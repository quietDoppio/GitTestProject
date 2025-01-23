package lesson11_classes

fun main() {
    val user1 = UserData(
        userId = 0,
        userLogin = "Viktor",
        userPassword = "1@23i4",
        userMail = "AlexDarkStalker2008@true.gangst"
    )
    val user2 = UserData(
        userId = 1,
        userLogin =  "Sasha",
        userPassword = "0o2p2rff%%@!",
        userMail = "lala@mail.com"
    )

    println("${user1.userId}, ${user1.userLogin}, ${user1.userPassword}, ${user1.userMail}")
    println("${user2.userId}, ${user2.userLogin}, ${user2.userPassword}, ${user2.userMail}")
}

class UserData(
    val userId: Int,
    val userLogin: String,
    val userPassword: String,
    val userMail: String,
)