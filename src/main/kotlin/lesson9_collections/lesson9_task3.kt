package lesson9_collections

fun main() {
    val omeletteIngredients = mutableListOf(2, 50, 15)

    print("Сколько вы хотите порций? ")
    val numberOfPortions = readln().toInt()
    val updatedIngredients = omeletteIngredients.map { it * numberOfPortions }

    println(
        "На $numberOfPortions вам понадобится: " +
                "Яиц - ${updatedIngredients[0]}, " +
                "Молока - ${updatedIngredients[1]} мл, " +
                "Сливочного масла - ${updatedIngredients[2]} гр."
    )
}
