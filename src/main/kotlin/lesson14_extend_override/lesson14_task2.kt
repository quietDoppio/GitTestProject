package lesson14_extend_override

fun main() {
    val cargoShip = HeavyCargoShip("Москва", "Грузовой", 15, 100)
    cargoShip.printInfo()
    cargoShip.loadCargo()
    val icebreaker = FastIcebreaker("Суши-база", "Ледокол", 15, true)
    icebreaker.printInfo()
    icebreaker.loadCargo()
    val passengerLiner = ComfortPassengerLiner("Титаник")
    passengerLiner.printInfo()
    passengerLiner.loadCargo()
}

open class OceanLiner(
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

    open fun loadCargo() {
        println("Ручная погрузка грузов.")
    }
}

class HeavyCargoShip(
    name: String,
    type: String,
    speed: Int,
    val loadCapacity: Int,
) : OceanLiner(name, type, speed) {
    override fun printInfo() {
        super.printInfo()
        println("Грузоподъёмность в тоннах: $loadCapacity")
    }

    override fun loadCargo() {
        println("Погрузочный кран активирован.")
    }
}

class FastIcebreaker(
    name: String,
    type: String,
    speed: Int,
    val isAbleToBreakIce: Boolean,
) : OceanLiner(name, type, speed) {
    override fun printInfo() {
        super.printInfo()
        println("Способность колоть лёд: $isAbleToBreakIce")
    }

    override fun loadCargo() {
        println("Открыты ворота со стороны кормы.")
    }
}

class ComfortPassengerLiner(
    name: String,
    val passengerCapacity: Int = 1000,
) : OceanLiner(name) {
    override fun printInfo() {
        super.printInfo()
        println("Вместимость пассажиров: $passengerCapacity")
    }

    override fun loadCargo() {
        println("Горизонтальный трап со шкафута выдвинут.")
    }
}