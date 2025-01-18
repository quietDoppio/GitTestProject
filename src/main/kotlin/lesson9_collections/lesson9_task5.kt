package lesson9_collections

fun main() {
    val ingredients = sortedSetOf<String>()

    println("Введите пять названий ингредиентов: ")
    while (ingredients.size < 5) {
        val userIngredient = readln().trim()
        if (!ingredients.add(userIngredient)) {
            println("Такой ингредиент уже присутствует в списке. Введите другой: ")
        }
    }
    val ingredientsResult = ingredients.toMutableList().apply {
        this[0] = this[0].replaceFirstChar { it.uppercase() }
    }
    println(ingredientsResult.joinToString(", "))
}