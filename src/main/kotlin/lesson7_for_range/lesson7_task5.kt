package lesson7_for_range

fun main() {
    val charRange = 'a'..'z'
    val upperCharRange = 'A'..'Z'
    val numsRange = '0'..'9'
    val passwordChars = charRange + upperCharRange + numsRange
    var userPasswordRange: IntRange

    val password = mutableListOf<Char>()
    password.add(charRange.random())
    password.add(upperCharRange.random())
    password.add(numsRange.random())

    do {
        print("Введите количество символов для вашего пароля не менее чем 6: ")
        userPasswordRange = (password.size + 1)..readln().toInt()
    } while (userPasswordRange.last < 6)

    for (i in userPasswordRange) {
        password.add(passwordChars.random())
    }
    println(password.shuffled().joinToString(""))
}
