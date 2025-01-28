package lesson15_interface

fun main() {
    val lada = PassengerCar("Лада")
    lada.getPassengerIn(3)

    val volga = PassengerCar("Волга")
    volga.getPassengerIn(2)

    val iveco = CargoCar("Ивеко")
    iveco.getPassengerIn(1)
    iveco.loadCargo(1.0)

    val ford = CargoCar("Форд")
    ford.loadCargo(1.0)
    ford.printCurrentPassengers()

    lada.drive()
    volga.drive()
    iveco.drive()
    ford.drive()

}

class PassengerCar(
    name: String,
    maxPassengers: Int = 3,
    currentPassengers: Int = 0,
) : Automobile(name, maxPassengers, currentPassengers)

class CargoCar(
    name: String,
    maxPassengers: Int = 1,
    currentPassengers: Int = 0,
    val maxCargo: Double = 2.0,
    private var currentCargo: Double = 0.0,
) : Automobile(name, maxPassengers, currentPassengers), CargoTransportation {

    override fun printCurrentCargo() {
        println("Текущий перевозимый вес в \"$name\" - $currentCargo")
        println("Максимальный вес - $maxCargo\n")
    }

    override fun loadCargo(weight: Double) {
        if ((weight + currentCargo) <= maxCargo && weight != 0.0) {
            currentCargo += weight
            println("$weight тонн было загружено в машину \"$name\".")
            printCurrentCargo()
        } else {
            println("Указаный вес не соответствует требованиям либо излишен для машины \"$name\".")
            printCurrentCargo()
        }
    }

    override fun unloadCargo(weight: Double) {
        if (weight <= currentCargo && weight != 0.0) {
            currentCargo -= weight
            println("$weight тонн было выгружено из машины \"$name\".")
            printCurrentCargo()
        } else {
            println("Указан некоректный вес для разгурзки из машины \"$name\".")
            printCurrentCargo()
        }
    }

}

abstract class Automobile(
    val name: String,
    val maxPassengers: Int,
    private var currentPassengers: Int,
) : Drivable, PassengerTransportation {

    override fun printCurrentPassengers() {
        println("Текущее кол-во пассажиров в \"$name\" - $currentPassengers")
        println("Максимальное кол-во пассажирова - $maxPassengers\n")
    }

    override fun drive() =
        println("Машина \"$name\" завелась и отправилась в путь.")


    override fun getPassengerIn(count: Int) {
        if ((count + currentPassengers) <= maxPassengers && count != 0) {
            currentPassengers += count
            println("Пассажир занял пассажирсоке место в \"$name\".")
            printCurrentPassengers()
        } else {
            println("Указано невозможное кол-во пассажиров для машины \"$name\" - $count.")
            printCurrentPassengers()
        }
    }

    override fun getPassengerOut(count: Int) {
        if (count <= currentPassengers && count != 0) {
            currentPassengers -= count
            println("Из \"$name\" вышел пассажир.")
            printCurrentPassengers()
        } else {
            println("Указано невозможное кол-во пассажиров из машины \"$name\" - $count.")
            printCurrentPassengers()
        }
    }
}

interface Drivable {
    fun drive() {
        println("Машина поехала.")
    }
}

interface PassengerTransportation {
    fun printCurrentPassengers()
    fun getPassengerIn(count: Int)
    fun getPassengerOut(count: Int)
}

interface CargoTransportation {
    fun printCurrentCargo()
    fun loadCargo(weight: Double)
    fun unloadCargo(weight: Double)
}
