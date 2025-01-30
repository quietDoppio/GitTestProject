package lesson18_polymorphism

const val CUBE_EDGES = 6
const val PAIR_COUNT = 2

fun main() {
    val parcelRectangle = ParcelRectangle(50.0, 20.0, 50.0)
    val parcelCube = ParcelCube(35.0)

    val boxShapes: List<ParcelBox> = listOf(parcelRectangle, parcelCube)
    boxShapes.forEach { println(it.getArea()) }
}

abstract class ParcelBox {
    abstract fun getArea(): Double
}

class ParcelRectangle(
    val length: Double,
    val height: Double,
    val width: Double,
) : ParcelBox() {
    override fun getArea() = PAIR_COUNT * (length * width + width * height + height * length)
}

class ParcelCube(
    val ribLength: Double
) : ParcelBox() {
    override fun getArea() = CUBE_EDGES * ribLength * ribLength
}
