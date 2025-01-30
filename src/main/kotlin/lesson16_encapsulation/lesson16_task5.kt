package lesson16_encapsulation

const val MAX_HP = 100
fun main() {
    val ashenOne = Player("Негорящий")
    while (ashenOne.health > 0) {
        ashenOne.hitPlayer()
        ashenOne.healPlayer()
    }
}

class Player(
    val name: String,
    private var _health: Int = 100,
    private var impactForce: Int = 25,
) {
    val health get() = _health

    fun hitPlayer() {
        val damageLvl = (5..50).random()
        if ((health - damageLvl) < 0) _health = 0
        else _health -= damageLvl
        println(
            "$name получил урон в размере - $damageLvl\n" +
                    "Текущее здоровье - $health\n"
        )
        if (health == 0) killPlayer()
    }

    fun healPlayer() {
        if (health != 0) {
            val healLvl = (1..25).random()
            if ((health + healLvl) > MAX_HP) _health = MAX_HP
            else _health += healLvl
            println(
                "$name изличился на - $healLvl\n" +
                        "Текущее здоровье - $health\n"
            )
        }
    }

    private fun killPlayer() {
        _health = 0
        impactForce = 0
        println("$name погиб.")
    }
}