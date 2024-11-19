package lesson5_if_Else

fun main() {
    val digitsRange = 0..42
    val digitsToWin = listOf(digitsRange.random(), digitsRange.random(), digitsRange.random())
    val userGuessList = emptyList<Int>().toMutableList()

    print("Введите первое число от 0 до 42: ")
    userGuessList.add(readln().toInt())

    print("Введите второе число от 0 до 42: ")
    userGuessList.add(readln().toInt())

    print("Введите третье число от 0 до 42: ")
    userGuessList.add(readln().toInt())

    val matchesSize = digitsToWin.intersect(userGuessList).size

    val extraWin = matchesSize == digitsToWin.size
    val bigWin = matchesSize == 2
    val smallWin = matchesSize == 1

    when {
        extraWin -> println("Поздравляю! Вы угадали все числа и выиграли джекпот.")
        bigWin -> println("Поздравляю! Вы угадали два числа и получаете крупный приз.")
        smallWin -> println("Вам выплачивается утешительный приз.")
        else -> println("Неудача. Вы не угадали ни одного числа.")
    }

    println("Выиграшные числа - $digitsToWin")
}