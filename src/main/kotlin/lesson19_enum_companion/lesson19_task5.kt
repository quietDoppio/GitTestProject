package lesson19_enum_companion

fun main() {
    var cardFile: List<Person> = emptyList()

    println("Добавьте данные в формате - \"Имя Пол\"(через один пробел) для 5 человек")
    println("Длступные варианты пола: ${Gender.MALE.readableGender}, ${Gender.FEMALE.readableGender}")
    cardFile = addNewPerson(5)
    cardFile.forEach {
        println(" - Имя: ${it.name}\n - Пол: ${it.gender.readableGender}\n")
    }
}

enum class Gender(val readableGender: String) {
    MALE("мужской"),
    FEMALE("женский"),
    UNKNOWN("нет информации"),
}

class Person(
    val name: String,
    val gender: Gender,
)

fun addNewPerson(count: Int): List<Person> {
    val cardFile = mutableListOf<Person>()
    var iterator = 0
    while (iterator < count) {
        print("Ваше имя и пол: ")
        val userInput = readln().trim().split(" ")
        if (userInput.size == 2) {
            cardFile.add(createPersonCard(userInput))
            iterator++
        } else {
            println("Ошибка ввода. Введите имя и пол через пробел")
        }
    }
    return cardFile
}

fun createPersonCard(userLine: List<String>): Person {
    val name = userLine[0].ifBlank { "нет информации" }
    val gender = when (userLine[1].lowercase()) {
        Gender.MALE.readableGender -> Gender.MALE
        Gender.FEMALE.readableGender -> Gender.FEMALE
        else -> Gender.UNKNOWN
    }
    return Person(name, gender)
}