package lesson18_polymorphism

fun main() {
    val screen = Screen()
    screen.draw("Круг", 10, 20)
    screen.draw("Квадрат", 45.0f, 55.2f, 30, 40)
    screen.draw(33, 43)
}

class Screen() {
    fun draw(shape: String, x: Int, y: Int) =
        println("Нарисован $shape с координатоми (x: $x, y: $y)")

    fun draw(shape: String, x: Float, y: Float, width: Int, height: Int) =
        println("Нарисован $shape с координатоми (x: $x, y: $y), ширина: $width, высота: $height")

    fun draw(x: Int, y: Int) =
        println("Нарисована точка с координатоми (x: $x, y: $y)")
}