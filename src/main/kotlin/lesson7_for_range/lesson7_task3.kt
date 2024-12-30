package lesson7_for_range

fun main() {
    print("Введите число: ")
    val userDigit = readln().toInt()
    val evenNumbersProgression = 0..userDigit step 2
    for (i in evenNumbersProgression) println(i)
}