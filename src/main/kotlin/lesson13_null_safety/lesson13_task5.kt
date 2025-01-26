package lesson13_null_safety

fun main() {
    val contact = getContact()
    contact?.printInfo()
}

fun getContact(): ContactPhoneDirectory? {
    try {
        print("Имя: ")
        val name = readln()

        print("Номер: ")
        val number = readln().toLong()

        print("Компания: ")
        val company = readln()

        val filledContact = ContactPhoneDirectory(name, number, company)
        return filledContact

    } catch (exc: NumberFormatException) {
        println("${exc::class.simpleName}.")
    }

    return null
}

class ContactPhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String,
) {
    fun printInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "Не указано"}")
    }
}