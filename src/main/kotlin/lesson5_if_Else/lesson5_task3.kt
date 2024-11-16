package lesson5_if_Else

fun main() {
    val firstDigitToWin = 12
    val secondDigitToWin = 7

    print("Введите первое число: ")
    var theGuess = readln().toInt()

    if (theGuess == firstDigitToWin) {
        print("Ого! Вы угадали, это - $theGuess!\nТеперь введите второе число: ")
        theGuess = readln().toInt()
        if (theGuess == secondDigitToWin) {
            println("Верно! Это - $theGuess!\nВы выиграли мууультиваааррррку!")
        } else {
            println("Вы пытались.. Вот ваш хот-дог\nПрвильные ответы: $firstDigitToWin, $secondDigitToWin")
        }
    } else {
        print("К сожалению верный ответ это - $firstDigitToWin.\nЕсли угадаете со второй цифрой то получите приз: ")
        theGuess = readln().toInt()
        if (theGuess == secondDigitToWin) {
            println("Верно! Это - $theGuess! Вот ваш хот-дог")
        } else {
            println("Может в другой раз..\nПрвильные ответы: $firstDigitToWin, $secondDigitToWin")
        }
    }
}