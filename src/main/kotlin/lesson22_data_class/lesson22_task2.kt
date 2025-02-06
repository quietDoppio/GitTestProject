package lesson22_data_class

fun main() {
    val commonDirectory = CommonDirectory("name", "name")
    val dataDirectory = DataDirectory("name", "name")

    println(commonDirectory) //Не переопределенный toString() выводит название пакета, класса и его хэш код.
    println(dataDirectory)  //Переопределенный метод toString() выводит свойства и их сзначения
}

class CommonDirectory(
    val name: String,
    val author: String,
)

data class DataDirectory(
    val name: String,
    val author: String,
)