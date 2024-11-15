package lesson2_arithmetic

const val PERCENT_SCALE = 100.0

fun main(){
    val crystalOreCount = 7
    val metalOreCount = 11
    val buffPercent = 20

    val crystalOreBuffedResources = ((buffPercent / PERCENT_SCALE) * crystalOreCount).toInt()
    val metalOreBuffedResources = ((buffPercent / PERCENT_SCALE)  * metalOreCount).toInt()

    println("Бонусная кристаллическая руда - $crystalOreBuffedResources")
    println("Бонусная железная руда - $metalOreBuffedResources")
}