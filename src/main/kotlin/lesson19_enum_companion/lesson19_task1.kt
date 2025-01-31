package lesson19_enum_companion

fun main() {
    println("Рыбки для аквариума: ")
    Fishes.entries.forEach {
        println("- ${it.ruName}")
    }
}

enum class Fishes(val ruName: String) {
    GUPPY("Гуппи"),
    ANGEL_FISH("Скалярия"),
    GOLD_FISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}