package lesson5_if_Else

fun main() {
    val firstDigitToWin = 17
    val secondDigitToWin = 34
    val finalText = "Верные ответы - $firstDigitToWin, $secondDigitToWin"

    val firstGuess: Boolean
    val secondGuess: Boolean

    print("Введите первое число от 0 до 42: ")
    var theGuess = readln().toInt()
    firstGuess = theGuess == firstDigitToWin || theGuess == secondDigitToWin

    print("Введите второе число от 0 до 42: ")
    theGuess = readln().toInt()
    secondGuess = theGuess == secondDigitToWin || theGuess == firstDigitToWin

    if (firstGuess && secondGuess) println("Поздравляем! Вы выиграли главный приз!\n$finalText")
    else if (firstGuess && !secondGuess || !firstGuess && secondGuess) println("Вы выиграли утешительный приз!\n$finalText")
    else println("Неудача\n$finalText")
}