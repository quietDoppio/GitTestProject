package lesson12_constructors

fun main() {
    val weatherStatus0 = WeatherStatus()
    val weatherStatus1 = WeatherStatus()

    weatherStatus1.dayTemperature = 36.0
    weatherStatus1.nighTemperature = 16.9
    weatherStatus1.isPrecipitation = false

    weatherStatus0.dayTemperature = 24.1
    weatherStatus0.nighTemperature = 10.0
    weatherStatus0.isPrecipitation = true

    weatherStatus0.printWeatherInfo()
    weatherStatus1.printWeatherInfo()
}


class WeatherStatus {
    var dayTemperature = 0.0
    var nighTemperature = 0.0
    var isPrecipitation = false

    fun printWeatherInfo() {
        println(
            """Дневная температура: $dayTemperature
            |Ночная температура: $nighTemperature
            |Наличие осадков: $isPrecipitation
        """.trimMargin()
        )
    }
}