package lesson10_functions

fun main() {
    print("Введите максимальное кол-во символов для пароля: ")
    val passwordRange = readln().toInt()
    println(generatePassword(passwordRange))
}

fun generatePassword(passwordRange: Int): String {
    val newPassword = StringBuilder()
    val charsRange = ' '..'/'
    val digitsRange = '0'..'9'

    repeat(passwordRange) {
        newPassword.append(if (it % 2 == 0) digitsRange.random() else charsRange.random())
    }
    return newPassword.toString()
}