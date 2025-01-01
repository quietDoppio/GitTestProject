package lesson8_array

fun main() {
    val dumplingsIngredients = arrayOf("Мука", "Мясо", "Вода", "Молоко", "Яйцо", "Соль")
    println("Ингредиенты: ${dumplingsIngredients.joinToString(", ")}")

    do {
        print("Приветствую. О каком ингредиенте хотите узнать? ")
        val enteredRequest = readln().replaceFirstChar { it.uppercase() }

        var newIngredient = ""
        if (enteredRequest in dumplingsIngredients) {
            val ingredientIndex = dumplingsIngredients.indexOf(enteredRequest)
            print("На что вы бы хотели его заменить? ")
            newIngredient = readln().replaceFirstChar { it.uppercase() }
            dumplingsIngredients[ingredientIndex] = newIngredient
        } else {
            println("Такого ингредиента нет в списке.")
        }
    } while (newIngredient !in dumplingsIngredients)

    println("Готово! Вы сохранили следующий список:\n${dumplingsIngredients.joinToString(", ")}")
}

