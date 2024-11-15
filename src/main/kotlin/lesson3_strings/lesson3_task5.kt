package lesson3_strings

fun main(){
    val chessMovement = "D2-D4;0"
    val splitMovementString = chessMovement.split("[;\\-]".toRegex())

        val fromPosition: String = splitMovementString[0]
        val toPosition: String = splitMovementString[1]
        val movementCount: String = splitMovementString[2]

    println(fromPosition)
    println(toPosition)
    println(movementCount)

}