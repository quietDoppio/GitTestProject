package lesson19_enum_companion

fun main() {
    val spaceShip = SpaceShip("ЕлоуСубмарин")
    spaceShip.fly()
    spaceShip.shootAsteroid()
    spaceShip.land()
}

interface Shootable {
    fun shootAsteroid()
}

interface Landable {
    fun land()
}

interface Flyable {
    fun fly()
}

class SpaceShip(
    val name: String,
) : Shootable, Landable, Flyable {
    override fun fly() {
        println("Корабль взлетел")
    }

    override fun shootAsteroid() {
    } // TODO реализовать функцию


    override fun land() {
        TODO()
    }
}
