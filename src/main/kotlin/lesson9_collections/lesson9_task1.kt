package lesson9_collections

fun main() {

    val pancakesIngredients = listOf("Молоко", "Масло", "Вода", "Соль", "Яйцо", "Сахар", "Мука")

    println("В рецепте есть следующие ингредиенты: $pancakesIngredients")
    pancakesIngredients.forEach {
        println(it)
    }


}