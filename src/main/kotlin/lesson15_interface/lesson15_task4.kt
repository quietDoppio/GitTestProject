package lesson15_interface

fun main() {
    val bow = Component("Смычёк", 10)
    val strings = Component("Струны", 40)
    val violin = MusicInstrument("Скрипка", 10, listOf(bow, strings))
    violin.findComponent()
}

interface ProductHandler {
    fun findComponent()
}

abstract class Product(
    val name: String,
    val amount: Int,
)

class MusicInstrument(
    name: String,
    amount: Int,
    val components: List<Component>
) : Product(name, amount), ProductHandler {
    override fun findComponent() {
        println("Выполняется поиск компонентов для товара - $name")
    }
}

class Component(
    name: String,
    amount: Int,
) : Product(name, amount)