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

    //intersect удаляет одинаковые элементы из за того что возвращает Set.
    //шанс поймать одинаковые числа мал но он есть. Я что то упустил?
    val matchesSize = digitsToWin.intersect(userGuessList).size

    val extraWin = matchesSize == digitsToWin.size
    val bigWin = matchesSize == 2
    val smallWin = matchesSize == 1

    if (extraWin) println("Поздравляю! Вы угадали все числа и выиграли джекпот.")
    else if (bigWin) println("Поздравляю! Вы угадали два числа и получаете крупный приз.")
    else if (smallWin) println("Вам выплачивается утешительный приз.")
    else println("Неудача. Вы не угадали ни одного числа.")

    println("Выиграшные числа - $digitsToWin")
}