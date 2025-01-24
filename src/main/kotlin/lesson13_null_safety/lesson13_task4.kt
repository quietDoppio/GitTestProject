package lesson13_null_safety

fun main() {
    val phoneContactBook = mutableSetOf<VPhoneContact?>()
    phoneContactBook.add(getContact())
    phoneContactBook.add(getContact())
    phoneContactBook.add(getContact())

    for (i in phoneContactBook) {
        i?.printInfo()
    }
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

fun getContact(): VPhoneContact? {
    print("Имя: ")
    val name = readln()

    print("Номер: ")
    val number = readln().toLongOrNull()
    if (number == null) {
        println("Телефонный номер не введён. Контакт не будет создан.")
        return null
    }

    print("Компания: ")
    var company: String? = readln()
    if (company == "") company = null

    return VPhoneContact(name, number, company)
}
