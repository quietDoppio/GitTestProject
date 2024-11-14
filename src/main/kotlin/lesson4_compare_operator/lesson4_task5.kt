package lesson4_compare_operator

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_PROVISIONS_COUNT = 50

fun main() {
    print("Имеются ли какие повреждения? - ")
    val isDamaged = readlnOrNull()?.toBoolean() ?: false
    print("Текущий состав экипажа - ")
    val crewCount = readlnOrNull()?.toIntOrNull() ?: 0
    print("Количество ящиков с провизией на борту - ")
    val provisionsCount = readlnOrNull()?.toIntOrNull() ?: 0
    print("Метиоусловия благоприятны? - ")
    val isWeatherGood = readlnOrNull()?.toBoolean() ?: false

    val isReadyToDepart =
        (!isDamaged && crewCount in MIN_CREW_COUNT..MAX_CREW_COUNT
                && provisionsCount > MIN_PROVISIONS_COUNT) ||
                (crewCount == MAX_CREW_COUNT && isWeatherGood
                        && provisionsCount >= MIN_PROVISIONS_COUNT)

    println("Корабль может отправлятсья".takeIf { isReadyToDepart }
        ?: "Кораблю лучше оставаться в бухте")
}