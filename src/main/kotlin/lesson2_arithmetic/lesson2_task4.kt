package lesson2_arithmetic

fun main(){
    val crystalOreCount = 7
    val metalOreCount = 11
    val buffPercent = 0.20

    val crystalOreBuffedResources = (buffPercent * crystalOreCount).toInt()
    val metalOreBuffedResources = (buffPercent * metalOreCount).toInt()
    println("""
        Бонусная кристаллическая руда - $crystalOreBuffedResources
        Бонусная железная руда - $metalOreBuffedResources
    """.trimIndent())
}