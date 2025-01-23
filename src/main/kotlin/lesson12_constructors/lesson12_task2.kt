package lesson12_constructors

fun main() {
    val weatherStatusBar0 = WeatherStatusBar(36.0, 16.9, false)
    val weatherStatusBar1 = WeatherStatusBar(24.1, 10.0, false)

    weatherStatusBar0.printWeatherInfo()
    weatherStatusBar1.printWeatherInfo()
}

class WeatherStatusBar(
    val dayTemperature: Double,
    val nighTemperature: Double,
    val isPrecipitation: Boolean,
) {
    fun printWeatherInfo() {
        println(
            """Дневная температура: $dayTemperature
            |Ночная температура: $nighTemperature
            |Наличие осадков: $isPrecipitation
        """.trimMargin()
        )
    }
}