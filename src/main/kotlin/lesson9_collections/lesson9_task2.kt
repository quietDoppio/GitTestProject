package lesson9_collections

fun main(){
    val teaWithChocolateIngredients = mutableListOf("Чай", "Вода", "Шоколад")
    println("В рецепте есть базовые ингредиенты: $teaWithChocolateIngredients")
    print("Желаете добавить ещё? ")
    val userAnswer = readln()

    if(userAnswer.equals("Да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        teaWithChocolateIngredients.add(newIngredient)
    } else {
        return
    }

    println("Теперь в рецепте есть следующие ингредиенты: $teaWithChocolateIngredients")
}