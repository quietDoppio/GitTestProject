package lesson18_polymorphism

fun main() {
    val octahedron: Dice = Octahedron(8)
    val hexagon: Dice = Hexagon(6)
    val tetrahedron: Dice = Tetrahedron(4)

    val listOfDice: List<Dice> = listOf(octahedron, hexagon, tetrahedron)
    listOfDice.forEach { it.throwDice() }

}

open class Dice(val edges: Int) {
    open fun throwDice() {
        println((1..edges).random())
    }
}

class Octahedron(edges: Int) : Dice(edges) {
    override fun throwDice() {
        print("Восьмиугольник: ")
        super.throwDice()
    }
}

class Hexagon(edges: Int) : Dice(edges) {
    override fun throwDice() {
        print("Шестиугольник: ")
        super.throwDice()
    }
}

class Tetrahedron(edges: Int) : Dice(edges) {
    override fun throwDice() {
        print("Четырёхугольник: ")
        super.throwDice()
    }
}