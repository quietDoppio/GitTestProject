package lesson2_arithmetic

import kotlin.math.pow
import kotlin.math.round

fun main(){
    val clientEnteredSum = 70_000
    val interestRate = 16.7 / 100
    val countOfYears= 20

    val finalSum = round((clientEnteredSum * (1+interestRate).pow(countOfYears)) * 1000) / 1000
    println(finalSum)
}