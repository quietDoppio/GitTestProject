package lesson18_polymorphism

fun main() {
    val octahedron: Dice = Octahedron()
    val hexagon: Dice = Hexagon()
    val tetrahedron: Dice = Tetrahedron()

    val listOfDice: List<Dice> = listOf(octahedron, hexagon, tetrahedron)
    listOfDice.forEach { it.throwDice() }
}

open class Dice(val edges: Int) {
    open fun throwDice() {
        println((1..edges).random())
    }
}

class Octahedron(edges: Int = 8) : Dice(edges) {
    override fun throwDice() {
        print("Восьмиугольник: ")
        super.throwDice()
    }
}

class Hexagon(edges: Int = 6) : Dice(edges) {
    override fun throwDice() {
        print("Шестиугольник: ")
        super.throwDice()
    }
}

class Tetrahedron(edges: Int = 4) : Dice(edges) {
    override fun throwDice() {
        print("Четырёхугольник: ")
        super.throwDice()
    }
}