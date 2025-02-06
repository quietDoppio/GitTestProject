package lesson22_data_class

fun main() {
    val dataClass = DataClass("name", 1, "email@.com")
    val (name, id, email) = dataClass
    println(name)
    println(id)
    println(email)
}

data class DataClass(
    val name: String,
    val id: Int,
    val email: String,
)