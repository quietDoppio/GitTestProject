package lesson20_lambda

fun main() {
    val printGreeting: (username: String) -> Unit = { println("С наступающим новым годом, $it!") }
    printGreeting("пользователь")
}
