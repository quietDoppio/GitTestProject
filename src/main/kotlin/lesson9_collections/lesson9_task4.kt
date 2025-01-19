package lesson9_collections

fun main() {

    print("Введите пять ингредиентов пива через запятую: ")
    val userIngredients = readln()
    val listOfIngredients = userIngredients.split(",").map { it.trim() }

    println(listOfIngredients.sorted())
}