package lesson15_interface

fun main() {
    val administrator = Administrator(0, "ADMIN")
    val commonUser = CommonUser(1, "USER")

    administrator.readForum()
    commonUser.sendMessage()

    administrator.deleteMessage(1)
    administrator.banUser(1)
}

abstract class ChatUser(val id: Int, val name: String) {
    fun readForum() {
        println("Пользователь $name читает форум.")
    }

    fun sendMessage() {
        println("Пользователь $name оставил сообщение.")
    }
}

class CommonUser(id: Int, name: String) : ChatUser(id, name)

class Administrator(id: Int, name: String) : ChatUser(id, name) {
    fun deleteMessage(userId: Int) {
        println("Сообщение пользователя с id: $userId было удалено администратором")
    }

    fun banUser(userId: Int) {
        println("Пользователь c id: $userId был забанен администратором.")
    }

}