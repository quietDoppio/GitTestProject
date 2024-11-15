package lesson2_arithmetic

import kotlin.math.pow

const val BASE_AMOUNT = 1
const val PERCENT_SCALE = 100

fun main() {
    val clientEnteredAmount = 70_000
    val interestRate = 16.7
    val years = 20

    val finalSum =
        (clientEnteredAmount * (BASE_AMOUNT + (interestRate / PERCENT_SCALE)).pow(years))

        println("%.3f".format(finalSum))
}