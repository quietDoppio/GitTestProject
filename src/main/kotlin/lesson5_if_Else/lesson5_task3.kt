package lesson5_if_Else

fun main() {
    val firstDigitToWin = 17
    val secondDigitToWin = 34
    val finalText = "Верные ответы - $firstDigitToWin, $secondDigitToWin"

    val isFirstAnswerGuessed: Boolean
    val isSecondAnswerGuessed: Boolean

    print("Введите первое число от 0 до 42: ")
    var theGuess = readln().toInt()
    isFirstAnswerGuessed = theGuess == firstDigitToWin || theGuess == secondDigitToWin

    print("Введите второе число от 0 до 42: ")
    theGuess = readln().toInt()
    isSecondAnswerGuessed = theGuess == secondDigitToWin || theGuess == firstDigitToWin

    if (isFirstAnswerGuessed && isSecondAnswerGuessed) println("Поздравляем! Вы выиграли главный приз!\n$finalText")
    else if (isFirstAnswerGuessed && !isSecondAnswerGuessed || !isFirstAnswerGuessed && isSecondAnswerGuessed)
        println("Вы выиграли утешительный приз!\n$finalText")
    else println("Неудача\n$finalText")
}