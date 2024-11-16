package lesson2_arithmetic

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60
const val HOURS_IN_DAY = 24

fun main() {
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTimeMinutes = 457

    val departureTimeSeconds = (departureTimeHours * SECONDS_IN_HOUR) + (departureTimeMinutes * SECONDS_IN_MINUTE)
    val travelTimeSeconds = travelTimeMinutes * SECONDS_IN_MINUTE
    val totalTimeSeconds = departureTimeSeconds + travelTimeSeconds

    val arrivalTimeHour = (totalTimeSeconds / SECONDS_IN_HOUR) % HOURS_IN_DAY
    val arrivalTimeMinutes = (totalTimeSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE

    println("$arrivalTimeHour:$arrivalTimeMinutes")
}