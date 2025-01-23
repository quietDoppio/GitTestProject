package lesson12_constructors

fun main() {
    val weatherStatusBar0 = WeatherStatusBar0(290, 275, false)
}

class WeatherStatusBar0(
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

    init {
        printWeatherInfo()
    }
}