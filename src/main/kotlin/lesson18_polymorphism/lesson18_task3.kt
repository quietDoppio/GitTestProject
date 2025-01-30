package lesson18_polymorphism

fun main() {
    val fox = Fox("Лис")
    val dog = Dog("Пёс")
    val cat = Cat("Кот")

    val animalsList: List<Animal> = listOf(fox, cat, dog)
    animalsList.forEach { it.eatFood() }
}

open class Animal(val name: String) {
    open fun eatFood() {}
}

class Fox(name: String) : Animal(name) {
    override fun eatFood() {
        println("$name ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eatFood() {
        println("$name ест кость")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eatFood() {
        println("$name ест рыбу")
    }
}