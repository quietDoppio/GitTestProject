package lesson14_extend_override

import kotlin.math.PI
import kotlin.math.pow

const val DIAMETER_FACTOR = 2

fun main() {
    val listOfFigures = listOf(
        Circle("Чёрный", 10.0),
        Circle("Белый", 13.4),
        Rectangle("Чёрынй", 5.0, 8.0),
        Rectangle("Белый", 18.9, 13.0)
    )

    var blackFiguresPerimeterSum = 0.0
    var whiteFigureAreaSum = 0.0
    listOfFigures.forEach {
        if (it.color == "Чёрный") blackFiguresPerimeterSum += it.getPerimeter()
        else whiteFigureAreaSum += it.getArea()
    }
    println("Сумма периметров всех чёрных фигур: ${String.format("%.2f", blackFiguresPerimeterSum)}")
    println("Сумма площаей всех белых фигур: ${String.format("%.2f", whiteFigureAreaSum)}")
}

abstract class Figure(val color: String) {
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double
) : Figure(color) {
    override fun getArea() = PI * radius.pow(2)
    override fun getPerimeter(): Double = DIAMETER_FACTOR * PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun getArea(): Double = width * height
    override fun getPerimeter(): Double = DIAMETER_FACTOR * (height + width)
}