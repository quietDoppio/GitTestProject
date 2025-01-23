package lesson_11_classes

class RecipesCategory(
    val recipes: MutableList<Recipe> = mutableListOf()
)

class Recipe(
    val name: String,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
    val cookingDescription: String,
    var portions: Int,
)

class Ingredient(
    val name: String,
    var quantity: Int,
)