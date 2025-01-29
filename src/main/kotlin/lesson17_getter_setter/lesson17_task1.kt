package lesson17_getter_setter

class Quiz(
    private val _question: String = "Когда новый год??",
    private var _reply: String = "",
) {
    val question
        get() = _question

    var reply: String
        get() = _reply
        set(value) {
            _reply = value
        }
}