package lesson16_encapsulation

const val MAX_HP = 100
fun main() {
    val ashenOne = Player("Негорящий")

    ashenOne.hitPlayer(50)
    ashenOne.healPlayer()
    ashenOne.hitPlayer(50)
    ashenOne.hitPlayer(50)
}

class Player(
    val name: String,
    private var _health: Int = 100,
    private var impactForce: Int = 25,
) {
    private var isDead: Boolean = false

    fun hitPlayer(damageLvl: Int) {
        if ((_health - damageLvl) <= 0) {
            _health = 0
            isDead = true
        } else {
            _health -= damageLvl
        }
        println(
            "$name получил урон в размере - $damageLvl\n" +
                    "Текущее здоровье - ${(_health).coerceAtLeast(0)}\n"
        )
        if (isDead) killPlayer()
    }

    fun healPlayer() {
        if (!isDead) {
            val healLvl = (1..25).random()
            if ((_health + healLvl) > MAX_HP) _health = MAX_HP
            else _health += healLvl
            println(
                "$name изличился на - $healLvl\n" +
                        "Текущее здоровье - $_health\n"
            )
        }
    }

    private fun killPlayer() {
        _health = 0
        impactForce = 0
        println("$name погиб.")
    }
}