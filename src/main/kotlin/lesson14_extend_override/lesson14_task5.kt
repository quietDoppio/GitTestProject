package lesson14_extend_override

fun main() {
    val chat = Chat()

    chat.addMessage("Виктор", "Главные ошибки человечества 20го века?")
    chat.addThreadMessage(0, "Джон Леннон", "Рок")
    chat.addThreadMessage(0, "Миядзаки", "Аниме")
    chat.addThreadMessage(0, "Миядзаки", "Дарк Соулс")
    chat.printChat()


}

class Chat(
    var nextId: Int = 0,
    val messages: MutableList<Message> = mutableListOf(),
    val threadMessages: MutableList<ChildMessage> = mutableListOf()
) {
    fun addMessage(author: String, text: String) {
        messages.add(Message(nextId++, author, text))
    }

    fun addThreadMessage(parentMessageId: Int, author: String, threadText: String) {
        threadMessages.add(ChildMessage(parentMessageId, author, threadText))
    }

    fun printChat() {
        val threadMessagesMap = threadMessages.groupBy { it.id }

        messages.forEach { message ->
            val threadMessagesString =
                threadMessagesMap[message.id]?.joinToString("\n") { "└ автор: ${it.author} - ${it.text}" } ?: ""
            println("автор: ${message.author} - ${message.text}\n$threadMessagesString")
        }
    }

}

open class Message(
    var id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    parentMessageId: Int,
    author: String,
    threadText: String
) : Message(parentMessageId, author, threadText)


