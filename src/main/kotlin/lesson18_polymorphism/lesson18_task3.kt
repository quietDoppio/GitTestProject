package lesson18_polymorphism

fun main() {
    val fox = Fox("Лис")
    val dog = Dog("Пёс")
    val cat = Cat("Кот")

    val animalsList: List<Animal> = listOf(fox, cat, dog)
    animalsList.forEach {
        it.eatFood()
        it.getSleep()
    }
}

abstract class Animal(val name: String) {
    abstract fun eatFood()
    open fun getSleep() = println("$name лёг спать\n")
}

class Fox(name: String) : Animal(name) {
    override fun eatFood() = println("$name ест ягоды")
}

class Dog(name: String) : Animal(name) {
    override fun eatFood() = println("$name ест кость")
}

class Cat(name: String) : Animal(name) {
    override fun eatFood() = println("$name ест рыбу")
}