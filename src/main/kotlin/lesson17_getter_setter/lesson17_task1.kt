package lesson17_getter_setter

fun main() {
    val quiz = Quiz()
    println(quiz.question)
    println(quiz.reply)

    quiz.reply = "Завтра"
    println(quiz.reply)
}

class Quiz(

) {
    val question: String = "Когда новый год??"
        get() = field

    var reply: String = "..."
        get() = field
        set(value) {
            field = value
        }
}