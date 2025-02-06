package lesson21_extension

fun main() {
    val player = AnotherPlayer("NAME", 10)
    println(player.isHealthy())
}

class AnotherPlayer(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 100,
) {
    fun printInfo() {
        println(" - Имя: $name, - Текущее здоровье: $currentHealth, - Максимальное здоровье: $maxHealth")
    }
}

fun AnotherPlayer.isHealthy(): Boolean {
    return this.currentHealth == maxHealth
}