package lesson12_constructors

import kotlin.random.Random

const val AVERAGE_DAYS_IN_MONTH = 30
const val AVERAGE_SUMMER_DAY_TEMP = 27
const val AVERAGE_SUMMER_NIGHT_TEMP = 16
const val MIN_SUMMER_NIGHT_TEMP = 10
fun main() {
    val weatherStatusInfoList = mutableListOf<WeatherStatusInfo>()
    repeat(AVERAGE_DAYS_IN_MONTH) {
        weatherStatusInfoList.add(
            WeatherStatusInfo(
                Random.nextInt(AVERAGE_SUMMER_NIGHT_TEMP, AVERAGE_SUMMER_DAY_TEMP),
                Random.nextInt(MIN_SUMMER_NIGHT_TEMP, AVERAGE_SUMMER_NIGHT_TEMP),
                Random.nextBoolean(),
            )
        )
    }

    val everyTempValueOfMonth = mutableListOf<Int>()
    var numberOfPrecipitationDays = 0
    weatherStatusInfoList.map {
        everyTempValueOfMonth.add(it.dayTemperature)
        everyTempValueOfMonth.add(it.nighTemperature)
        if (it.isPrecipitation) numberOfPrecipitationDays++
    }
    val averageTempValueOfMonth = everyTempValueOfMonth.average()
    println(
        "Средняя температура за месяц: ${String.format("%.1f", averageTempValueOfMonth)};\n" +
                "Кол-во дней с осадками: $numberOfPrecipitationDays"
    )
}

class WeatherStatusInfo(
    _dayTemperature: Int,
    _nighTemperature: Int,
    _isPrecipitation: Boolean,
) {
    var dayTemperature = _dayTemperature
    var nighTemperature = _nighTemperature
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