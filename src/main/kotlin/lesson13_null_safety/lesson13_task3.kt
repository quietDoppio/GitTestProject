package lesson13_null_safety

fun main() {
    val contactList = mutableListOf(
        PhoneNoteContact("Алексей", 88002224020, "null"),
        PhoneNoteContact("Константин", 89214015523, null),
        PhoneNoteContact("Виктор", 89950558911, null),
        PhoneNoteContact("Анна", 89051319080, "гуголь"),
        PhoneNoteContact("Анастасия", 5559284, "гуголь"),
    )
    val filteredContactList = contactList.mapNotNull { it.company }.distinct()

    for (i in filteredContactList) {
        println(i)
    }
}

class PhoneNoteContact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "Не указано"}")
    }
}
