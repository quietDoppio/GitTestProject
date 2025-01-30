package lesson18_polymorphism

fun main() {
    val screen = Screen()
    screen.draw("Круг", 10.0f, 20)
    screen.draw("Квадрат", 45.0f, 55, 30, 40)
    screen.draw(33f, 43)
}

class Screen() {
    fun draw(shape: String, x: Float, y: Int) =
        println("Нарисован $shape с координатоми (x: $x, y: $y)")

    fun draw(shape: String, x: Float, y: Int, width: Int, height: Int) =
        println("Нарисован $shape с координатоми (x: $x, y: $y), ширина: $width, высота: $height")

    fun draw(x: Float, y: Int) =
        println("Нарисована точка с координатоми (x: $x, y: $y)")
}