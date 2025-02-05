package lesson21_extension

fun main() {
    val skillPoint = mapOf<String, Int>(
        "Выносливость" to 64,
        "Здоровье" to 80,
        "Грузоподъёмность" to 80,
        "Ловкость" to 10,
        "Скорость бега" to 15
    )
    println(skillPoint.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
   val maxCategory = this.entries.maxByOrNull { it.value }
    return maxCategory?.key ?: "null"
}

