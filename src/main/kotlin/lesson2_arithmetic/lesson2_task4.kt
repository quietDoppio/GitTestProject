package lesson2_arithmetic

const val PERCENT_SCALE_DOUBLE = 100.0

fun main(){
    val crystalOreCount = 7
    val metalOreCount = 11
    val buffPercent = 20

    val crystalOreBuffedResources = ((buffPercent / PERCENT_SCALE_DOUBLE) * crystalOreCount).toInt()
    val metalOreBuffedResources = ((buffPercent / PERCENT_SCALE_DOUBLE)  * metalOreCount).toInt()

    println("Бонусная кристаллическая руда - $crystalOreBuffedResources")
    println("Бонусная железная руда - $metalOreBuffedResources")
}