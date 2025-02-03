package lesson20_lambda

fun main() {
    val player = CommonPlayer("Игрок", 50, 100)
    player.printInfo()
    healPlayer(player)
    player.printInfo()
}

class CommonPlayer(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    fun printInfo() {
        println(" - Имя: $name, - Текущее здоровье: $currentHealth, - Максимальное здоровье: $maxHealth")
    }
}

val healPlayer: (player: CommonPlayer) -> Unit = { player ->
    player.currentHealth = player.maxHealth
    println("${player.name} рименил лечебное зелье. Здоровье повышено до ${player.maxHealth} ед.")
}