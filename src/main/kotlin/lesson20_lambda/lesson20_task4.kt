package lesson20_lambda

fun main() {
    val elements = listOf("А", "Б", "В", "Г", "Д")
    val clickedElements = elements.map { { println("Нажат элемент $it") } }

    clickedElements.forEachIndexed { index, element ->
        if (index % 2 == 1) element()
    }
}