package lesson2_arithmetic

const val PERCENT_SCALE = 100.0

fun main(){
    val crystalOreCount = 7
    val metalOreCount = 11
    val buffPercent = 20 / PERCENT_SCALE

    val crystalOreBuffedResources = (buffPercent * crystalOreCount).toInt()
    val metalOreBuffedResources = (buffPercent * metalOreCount).toInt()

    println("""
        Бонусная кристаллическая руда - $crystalOreBuffedResources
        Бонусная железная руда - $metalOreBuffedResources
    """.trimIndent())
}