package lesson13_null_safety

fun main() {
    val contact = PhoneBookContact("Алексей", 89994048124)
    contact.printInfo()
}

class PhoneBookContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "Не указано"}")
    }
}
