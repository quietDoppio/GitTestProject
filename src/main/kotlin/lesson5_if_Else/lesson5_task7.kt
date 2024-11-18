package lesson5_if_Else

const val DISTANCE_FOR_FUEL_CONSUMPTION = 100
fun main() {
    print("Расстояние поездки (в километрах): ")
    val distanceOfTrip = readln().toDouble()
    print("Расход топлива на 100 км (в литрах): ")
    val fuelFlow = readln().toFloat()
    print("Текущая цена за литр топлива: ")
    val fuelPrice = readln().toFloat()

    val requiredFuelValue = (distanceOfTrip * fuelFlow) / DISTANCE_FOR_FUEL_CONSUMPTION
    val finalFuelPrice = requiredFuelValue * fuelPrice

    println("Необходимое количество топлива - ${"%.2f".format(requiredFuelValue)} л")
    println("Итоговая стоимость топлива - ${"%.2f".format(finalFuelPrice)}")
}