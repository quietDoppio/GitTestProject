package lesson14_extend_override

fun main() {
    val cargoShip = CargoShip("Москва", "Грузовой", 15, 100)
    cargoShip.printInfo()
    val icebreaker = Icebreaker("Суши-база", "Ледокол", 15, true)
    icebreaker.printInfo()
    val passengerLiner = PassengerLiner("Титаник")
    passengerLiner.printInfo()
}

open class Liner(
    val name: String,
    val type: String = "Пассажирский",
    val speed: Int = 20,
) {
    open fun printInfo() {
        println(
            "\nНаименование: $name\n" +
                    "Тип: $type\n" +
                    "Скорость км/ч: $speed"
        )
    }
}

class CargoShip(
    name: String,
    type: String,
    speed: Int,
    val loadCapacity: Int,
) : Liner(name, type, speed) {
    override fun printInfo() {
        super.printInfo()
        println("Грузоподъёмность в тоннах: $loadCapacity")
    }
}

class Icebreaker(
    name: String,
    type: String,
    speed: Int,
    val isAbleToBreakIce: Boolean,
) : Liner(name, type, speed) {
    override fun printInfo() {
        super.printInfo()
        println("Способность колоть лёд: $isAbleToBreakIce")
    }
}

class PassengerLiner(
    name: String,
    val passengerCapacity: Int = 1000,
) : Liner(name) {
    override fun printInfo() {
        super.printInfo()
        println("Вместимость пассажиров: $passengerCapacity")
    }
}
