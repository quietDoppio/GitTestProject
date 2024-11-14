package lesson2_arithmetic

import kotlin.math.pow
import kotlin.math.round

const val ROUNDING_SCALE = 1000
const val BASE_AMOUNT = 1
const val PERCENT_SCALE = 100

fun main() {
    val clientEnteredSum = 70_000
    val interestRate = 16.7 / PERCENT_SCALE
    val countOfYears = 20

    val finalSum = round(
        (clientEnteredSum * (BASE_AMOUNT + interestRate).pow(countOfYears)) * ROUNDING_SCALE
    ) / ROUNDING_SCALE

        println(finalSum)
}