package lesson18_polymorphism

fun main() {
    val screen = Screen()
    screen.draw("Круг", 10.0f, 20.0f)
    screen.draw("Круг", 15, 23)

    screen.draw("Квадрат", 45.0f, 55.0f, 30, 40)
    screen.draw("Квадрат", 45, 55, 30, 40)

    screen.draw(33.0f, 43.0f)
    screen.draw(100, 70)
}

class Screen() {
    fun draw(shape: String, x: Float, y: Float) =
        println("Нарисован $shape с координатоми (x: $x, y: $y)")
    fun draw(shape: String, x: Int, y: Int) =
        println("Нарисован $shape с координатоми (x: $x, y: $y)")

    fun draw(shape: String, x: Float, y: Float, width: Int, height: Int) =
        println("Нарисован $shape с координатоми (x: $x, y: $y), ширина: $width, высота: $height")
    fun draw(shape: String, x: Int, y: Int, width: Int, height: Int) =
        println("Нарисован $shape с координатоми (x: $x, y: $y), ширина: $width, высота: $height")

    fun draw(x: Float, y: Float) =
        println("Нарисована точка с координатоми (x: $x, y: $y)")
    fun draw(x: Int, y: Int) =
        println("Нарисована точка с координатоми (x: $x, y: $y)")
}