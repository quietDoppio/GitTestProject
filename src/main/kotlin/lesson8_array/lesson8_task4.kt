package lesson8_array

fun main() {
    val dumplingsIngredients = arrayOf("Мука", "Мясо", "Вода", "Молоко", "Яйцо", "Соль")
    println("Ингредиенты: ${dumplingsIngredients.joinToString(", ")}")

    var newIngredient = ""
    do {
        print("Приветствую. Какой ингредиент интересует? ")
        val enteredRequest = readln().replaceFirstChar { it.uppercase() }
        val ingredientIndex = dumplingsIngredients.indexOf(enteredRequest)

        if (ingredientIndex == -1) {
            println("Такого ингредиента нет в списке.")
        } else {
            print("На какой ингредиент вы хотите его заменить? ")
            newIngredient = readln().replaceFirstChar { it.uppercase() }
            dumplingsIngredients[ingredientIndex] = newIngredient
        }

    } while (newIngredient !in dumplingsIngredients)

    println("Готово! Вы сохранили следующий список:\n${dumplingsIngredients.joinToString(", ")}")
}

