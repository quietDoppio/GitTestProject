package lesson3_strings

fun main(){
    var moveCount = 1
    var fromPosition = "E2"
    var toPosition = "E4"

        println("ход: $fromPosition - $toPosition, номер хода: $moveCount")

    fromPosition = "D2"
    toPosition = "D3"

        println("ход: $fromPosition - $toPosition, номер хода: ${++moveCount}")
}