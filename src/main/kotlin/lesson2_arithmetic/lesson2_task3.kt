package lesson2_arithmetic

fun main(){
    val departureTimeSeconds  = (9*3600) + (39 * 60)
    val travelTimeSeconds = 457 * 60

    val arrivalTimeHour = (departureTimeSeconds + travelTimeSeconds)/3600
    val arrivalTimeMinutes = ((departureTimeSeconds + travelTimeSeconds)%3600)/60

        println("$arrivalTimeHour:$arrivalTimeMinutes")
}