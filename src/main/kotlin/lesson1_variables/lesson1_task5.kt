package lesson1_variables

const val SPACE_DURATION_SECONDS = 6480
const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val hours: Byte = (SPACE_DURATION_SECONDS / SECONDS_IN_HOUR).toByte()
    val minutes: Byte = ((SPACE_DURATION_SECONDS % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE).toByte()
    val seconds: Byte = (SPACE_DURATION_SECONDS % SECONDS_IN_MINUTE).toByte()

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}