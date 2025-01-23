package lesson11_classes

fun main() {
    val forum = Forum()
    forum.createNewUser("Саша")
    forum.createNewUser("Вася")
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.printThread()
}

class Forum(
    private val forumUsers: MutableSet<ForumMember> = mutableSetOf(),
    private val forumMessages: MutableSet<ForumMessage> = mutableSetOf()
) {

    fun createNewUser(userName: String): ForumMember {
        val userId = forumUsers.size + 1
        val newUser = ForumMemberBuilder()
            .setUserId(userId)
            .setUserName(userName)
            .build()
        forumUsers.add(newUser)
        println("Пользователь $userName создан")
        return newUser
    }

    fun createNewMessage(userId: Int) {
        val user = forumUsers.find { it.userId == userId }
        if (user != null) {
            print("Пользователь ${user.userName} пишет: ")
            val newMassage = ForumMessageBuilder()
                .setAuthorId(userId)
                .setUserMessage(readln())
                .build()
            forumMessages.add(newMassage)
        } else {
            println("Пользователь под id: $userId не найден.")
        }
    }

    fun printThread() {
        forumMessages.forEach { message ->
            val author = forumUsers.find { it.userId == message.authorId }
            author?.let {
                println("${author.userName}: ${message.message}")
            }
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String
)


class ForumMemberBuilder() {
    private var userId = 0
    private var userName = ""

    fun setUserId(id: Int) = apply { userId = id }
    fun setUserName(name: String) = apply { userName = name }
    fun build() = ForumMember(userId, userName)
}

class ForumMessageBuilder() {
    private var authorId = 0
    private var userMessage = ""

    fun setAuthorId(id: Int) = apply { authorId = id }
    fun setUserMessage(message: String) = apply { userMessage = message }
    fun build() = ForumMessage(authorId, userMessage)
}