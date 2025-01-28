package lesson16_encapsulation

import kotlin.math.pow

const val RADIUS_MULTIPLIER = 2
private const val PI = 3.14

fun main() {
    val circle0 = Circle0(15.7)
    println(
        "Длина окружности = ${String.format("%.2f", circle0.getLength())}\n" +
                "Площадь окружности = ${String.format("%.2f", circle0.getArea())}"
    )
}

class Circle0(
    private val radius: Double,
) {
    fun getLength(): Double = RADIUS_MULTIPLIER * radius * PI
    fun getArea(): Double = PI * radius.pow(RADIUS_MULTIPLIER)
}
