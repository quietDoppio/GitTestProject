package lesson20_lambda

fun main() {
    val player0 = OneMorePlayer("Player0", false)
    val player1 = OneMorePlayer("Player1", true)
    println(checkKey(player0))
    println(checkKey(player1))
}

class OneMorePlayer(
    val name: String,
    val isKeyAvailable: Boolean,
)

val checkKey = { player: OneMorePlayer ->
    if (player.isKeyAvailable) "Игрок ${player.name} открыл дверь"
    else "Дверь заперта"
}
