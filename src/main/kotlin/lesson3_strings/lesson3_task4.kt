package lesson3_strings

fun main() {
    var fromPosition = "E2"
    var toPosition = "E4"
    var moveCount = 1

    var movementInfo = "$fromPosition-$toPosition;$moveCount"
    println(movementInfo)

    fromPosition = "D2"
    toPosition = "D3"
    moveCount++

    movementInfo = "$fromPosition-$toPosition;$moveCount"
    println(movementInfo)
}