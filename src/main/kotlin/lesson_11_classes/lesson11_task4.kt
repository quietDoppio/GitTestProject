package lesson_11_classes

class RecipesCategory(
    val name: String,
    val description: String,
    val icon: String,
)

class Recipe(
    val name: String,
    val ingredients: MutableList<String> = mutableListOf(),
    val cookingDescription: String,
    var portions: Int,
)

class Ingredient(
    val name: String,
    var quantity: Int,
)