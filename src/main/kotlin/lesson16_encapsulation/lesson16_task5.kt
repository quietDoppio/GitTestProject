package lesson16_encapsulation

const val MAX_HP = 100
fun main() {
    val ashenOne = Player("Негорящий")
    while (ashenOne.getHealthLvl() > 0) {
        ashenOne.hitPlayer()
    }
}

class Player(
    val name: String,
    private var health: Int = 100,
    private var impactForce: Int = 25,
) {
    fun getHealthLvl(): Int = health

    fun hitPlayer() {
        val damageLvl = (5..50).random()
        health -= damageLvl
        println(
            "$name получил урон в размере - $damageLvl\n" +
                    "Текущее здоровье - $health\n"
        )
        if (health <= 0) killPlayer()
        else healPlayer()
    }

    fun healPlayer() {
        val healLvl = (1..25).random()
        if ((health + healLvl) > MAX_HP) health = MAX_HP
        else health += healLvl
        println(
            "$name изличился на - $healLvl\n" +
                    "Текущее здоровье - $health\n"
        )
    }

    private fun killPlayer() {
        health = 0
        impactForce = 0
        println("$name погиб.")
    }
}