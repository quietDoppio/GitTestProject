package lesson21_extension

fun main() {
    val newString = "МАМА мыла рамУ"
    print(newString.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "eyuioaуеыаоэяиюё".toSet()
    return this.lowercase().count {
        it in vowels
    }
}