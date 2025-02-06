package lesson22_data_class

fun main() {
    val regularBook0 = RegularBook("name", "name")
    val regularBook1 = RegularBook("name", "name")

    val dataBook0 = DataBook("name", "name")
    val dataBook1 = DataBook("name", "name")

    println(regularBook0 === regularBook1) //false. Сравнение ссылок объектов в памяти. Два разных объекта.
    println(regularBook0 == regularBook1) //false. Так же сравнение адресов объектов. equals не переопределён.

    println(dataBook0 === dataBook1) //false. Сравнение ссылок на объекты в памяти. Два разных объекта.
    println(dataBook0 == dataBook1) //true. equals переопределён. Сравнение по значениям объекта а не адресам в памяти
}

class RegularBook(
    val name: String,
    val author: String,
) {

}

data class DataBook(
    val name: String,
    val author: String,
) {

}
