package lesson9_collections

fun main() {
    val omeletteIngredients = mutableListOf(2, 50, 15)

    print("Сколько вы хотите порций? ")
    val numberOfPortions = readln().toInt()

    for (i in omeletteIngredients.indices) {
        omeletteIngredients[i] = omeletteIngredients[i] * numberOfPortions
    }
    println(
        "На $numberOfPortions вам понадобится: " +
                "Яиц - ${omeletteIngredients[0]}, " +
                "Молока - ${omeletteIngredients[1]} мл, " +
                "Сливочного масла - ${omeletteIngredients[2]} гр."
    )
}
