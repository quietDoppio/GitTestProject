package lesson15_interface

fun main() {
    val weatherServer0 = WeatherServer(Temperaturee(25))
    val weatherServer1 = WeatherServer(PrecipitationAmount(7))
    weatherServer0.printInfo()
    weatherServer1.printInfo()

}

class WeatherServer(val weatherStationStats: WeatherStationStats) {
    fun printInfo() {
        when (weatherStationStats) {
            is Temperaturee -> weatherStationStats.printTemperature()
            is PrecipitationAmount -> weatherStationStats.printPrecipitationAmount()
        }
    }
}

abstract class WeatherStationStats()

class Temperaturee(val temperature: Int) : WeatherStationStats() {
    fun printTemperature() = println(temperature)
}

class PrecipitationAmount(val precipitationAmount: Int) : WeatherStationStats() {
    fun printPrecipitationAmount() = println(precipitationAmount)
}