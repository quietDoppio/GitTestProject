package lesson13_null_safety

fun main() {
    val phoneContactBook = getContacts()

    for (i in phoneContactBook) {
        i.printInfo()
    }
}

fun getContacts(): List<VPhoneContact> {
    val contactBook = mutableListOf<VPhoneContact>()
    do {
        var isNext = true
        print("Имя: ")
        val name = readln()

        print("Номер: ")
        val number = readln().toLongOrNull()
        if (number == null) {
            println("Телефонный номер не введён или введён некоректно. Контакт не будет создан.")
            continue
        }

        print("Компания: ")
        var company: String? = readln()
        if (company.isNullOrBlank()) company = null

        contactBook.add(VPhoneContact(name, number, company))
        print("Добавить ещё? Да/Нет: ")
        if (readln().lowercase() != "да") isNext = false

    } while (isNext)

    return contactBook
}

class VPhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "Не указано"}")
    }
}
