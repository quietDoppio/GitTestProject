package lesson4_compare_operator

const val REQUIRED_AIR_HUMIDITY = 20
const val WRONG_SEASON = "зима"

fun main() {
    val isWeatherSunny: Boolean = true
    val isTentOpen: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = "зима"

    val isConditionsGood =
        isWeatherSunny
                && isTentOpen
                && airHumidity == REQUIRED_AIR_HUMIDITY
                && currentSeason != WRONG_SEASON

    println(
        "Благоприятные ли условия сейчас для роста бобовых? $isConditionsGood"
    )
}