package lesson8_array

fun main() {
    val caesarSaladIngredients = arrayOf("Курица", "Хлеб", "Сыр", "Масло", "Соль", "Соус")
    print("Приветствую. О каком ингридеенте хотите узнать? ")
    val enteredIngredient = readln()

    var result = "Такого ингредиента в рецепте нет"
    for (i in caesarSaladIngredients) {
        if (i.equals(enteredIngredient, ignoreCase = true)) {
            result = "Ингридиент $enteredIngredient в рецепте есть"
            break
        }
    }
     println(result)
}