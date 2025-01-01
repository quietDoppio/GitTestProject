package lesson8_array


fun main() {

    print("Здравствуйте. Введите количество будующих ингредиентов: ")
    val numberOfIngredients = readln().toInt()
    val pancakesIngredients = Array(numberOfIngredients) { "" }

    println("Введите нужные ингредиенты: ")
    for (i in pancakesIngredients.indices) {
        pancakesIngredients[i] = readln()
    }
    println(pancakesIngredients.joinToString(", "))

}