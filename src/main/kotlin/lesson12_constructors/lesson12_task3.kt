package lesson12_constructors

fun main() {
    val weatherStatusBar = WeatherStatusBar(290, 275, false)
    weatherStatusBar.printWeatherInfo()
}

class WeatherStatusBar(
    _dayTemperature: Int,
    _nighTemperature: Int,
    _isPrecipitation: Boolean,
) {
    var dayTemperature = _dayTemperature - 273
    var nighTemperature = _nighTemperature - 273
    var isPrecipitation: Boolean = _isPrecipitation

    fun printWeatherInfo() {
        println(
            """Дневная температура в цельсиях: $dayTemperature
            |Ночная температура в цельсиях: $nighTemperature
            |Наличие осадков: $isPrecipitation
        """.trimMargin()
        )
    }
}