package lesson14_extend_override

fun main() {
    val planetMars = Planet(
        "Марс",
        true,
        false,
        listOf(
            Satellite("Деймос", false, false),
            Satellite("Фобос", false, false)
        )
    )
    println("Планета - ${planetMars.name}")
    planetMars.listOfSatellites.forEach {
        println("Спутник - ${it.name}")
    }
}

abstract class SpaceObject(
    val name: String,
    val isAtmosphereExist: Boolean,
    val isAbleToDeploy: Boolean,
)

class Planet(
    name: String,
    isAtmosphereExist: Boolean,
    isAbleToDeploy: Boolean,
    val listOfSatellites: List<Satellite>
) : SpaceObject(name, isAtmosphereExist, isAbleToDeploy)

class Satellite(
    name: String,
    isAtmosphereExist: Boolean,
    isAbleToDeploy: Boolean,
) : SpaceObject(name, isAtmosphereExist, isAbleToDeploy)