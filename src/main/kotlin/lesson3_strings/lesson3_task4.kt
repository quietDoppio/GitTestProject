package lesson3_strings

fun main(){
    var moveCount = 1
    var fromPosition = "E2"
    var toPosition = "E4"

        println("Ход чёрных\nход: $fromPosition - $toPosition, номер хода: $moveCount")

    fromPosition = "D2"
    toPosition = "D3"

        println("Ход белых\nход: $fromPosition - $toPosition, номер хода: ${++moveCount}")
}