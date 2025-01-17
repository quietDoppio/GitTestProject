package lesson8_array

fun main() {
    val caesarSaladIngredients = arrayOf("Курица", "Хлеб", "Сыр", "Масло", "Соль", "Соус")
    print("Приветствую. О каком ингредиенте хотите узнать? ")
    val enteredIngredient = readln().replaceFirstChar { it.uppercase() }

    if (caesarSaladIngredients.contains(enteredIngredient)) {
        println("Ингредиент $enteredIngredient в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}
