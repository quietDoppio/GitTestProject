package lesson_11_classes

fun main() {
    val mainChatRoom = ChatRoom(
        "cool_skeleton.jpg",
        "качели"
    )
}

class ChatRoom(
    var cover: String,
    var name: String,
    val listOfUsers: MutableList<ChatUser> = mutableListOf()
) {
    fun addUser(chatUser: ChatUser) {
        listOfUsers.add(chatUser)
    }

    fun updateUserStatus(userName: String, userStatus: String) {
        val user = listOfUsers.find { it.userName == userName }
        if (user != null) user.userStatus = userStatus
        else println("Пользователя под ником $userName не найден в комнате $name")
    }
}

class ChatUser(
    var userName: String,
    var userAvatar: String,
    var userStatus: String,
)