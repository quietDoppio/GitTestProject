package lesson22_data_class

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Ближайшая к Солнцу звездная система, состоящая из трех звезд: Альфа Центавра A, B и Проксима Центавра.",
        "07.10.1689",
        4.37
    )

    println(
        """
        Название - ${alphaCentauri.component1()}
        Описание - ${alphaCentauri.component2()}
        Дата - ${alphaCentauri.component3()}
        Расстояние - ${alphaCentauri.component4()}
    """.trimIndent()
    )
}

data class GalacticGuide(
    val title: String,
    val description: String,
    val eventDate: String,
    val distanceFromEarth: Double,
)