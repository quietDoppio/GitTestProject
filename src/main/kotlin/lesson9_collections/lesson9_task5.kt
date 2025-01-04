package lesson9_collections

fun main() {
    val listOfEnteredIngredients = MutableList(5) { "" }

    println("Введите пять названий ингредиентов: ")
    var iterator = 0
    while (iterator in listOfEnteredIngredients.indices) {
        val userIngredient = readln()
        if (userIngredient in listOfEnteredIngredients) {
            println("Такой ингредиент уже присутствует в списке. Введите другой: ")
            continue
        }
        listOfEnteredIngredients[iterator] = userIngredient
        iterator++
    }
    listOfEnteredIngredients.sort()
    listOfEnteredIngredients[0] = listOfEnteredIngredients[0].replaceFirstChar { it.uppercase() }
    println(listOfEnteredIngredients.joinToString(", "))
}