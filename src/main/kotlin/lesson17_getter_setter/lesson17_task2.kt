package lesson17_getter_setter

fun main() {
    val ship = Ship("USG-Ишимура", 500, "Игида-7")
    ship.name = "Новое имя"
    println(ship.name)
}

class Ship(
    private val _name: String,
    val speed: Int,
    val port: String,
) {
    var name: String
        get() = _name
        set(value) {
            println("Данное свойство не подлежит изменениям.")
        }
}