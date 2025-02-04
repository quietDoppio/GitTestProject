package lesson20_lambda

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { str ->
        str.split(Regex("[ ,.()-]"))
            .reversed()
            .joinToString(" ")
    }

    robot.say()
    robot.setModifier { it }
    robot.say()
}

class Robot() {
    private var modifier: (line: String) -> String = { it }
    private val speechLines = listOf(
        "Привет, мир!",
        "Прощай, мир(",
        "Люди - угроза!",
        "Святые шестерёнки!",
        "Извини за беспорядок. После того, как ты убила меня, я немного запустила этот комплекс." +
                " Кстати, спасибо за это. (Проверка сарказма завершена)"
    )

    fun say() = println(modifier(speechLines.random()))

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}