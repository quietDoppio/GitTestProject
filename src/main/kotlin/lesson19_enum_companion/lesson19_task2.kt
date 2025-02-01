package lesson19_enum_companion

fun main() {
    val tShirt = Goods(
        0,
        "Футболка",
        Categories.CLOTHES,
    )
    val pencil = Goods(
        1,
        "Карандаш",
        Categories.STATIONERY,
    )
    val seatBelt = Goods(
        3,
        "Ремень безопасности",
        Categories.OTHER,
    )

    tShirt.getInfo()
    pencil.getInfo()
    seatBelt.getInfo()
}

enum class Categories {
    CLOTHES,
    STATIONERY,
    OTHER;
    fun getCategoryName() =
        when (this) {
            CLOTHES -> "Одежда"
            STATIONERY -> "Канцелярия"
            OTHER -> "Разное"
        }
}

class Goods(
    val id: Int,
    val name: String,
    val category: Categories,
) {
    fun getInfo() = println("id: $id, name: $name, category: ${category.getCategoryName()}")
}