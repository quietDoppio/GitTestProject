package lesson4_compare_operator

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100
fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80

    val secondCargoWeight = 50
    val secondCargoVolume = 100

    val informTextTemplate =
        "Груз весом %d кг и объемом %d соответствует категории \'Average\': %b"

    println(
        String.format(
            informTextTemplate,
            firstCargoWeight,
            firstCargoVolume,
            firstCargoWeight > AVERAGE_MIN_WEIGHT &&
                    firstCargoWeight <= AVERAGE_MAX_WEIGHT &&
                    firstCargoVolume < AVERAGE_MAX_VOLUME
        )
    )

    println(
        String.format(
            informTextTemplate,
            secondCargoWeight,
            secondCargoVolume,
            secondCargoWeight > AVERAGE_MIN_WEIGHT &&
                    secondCargoWeight <= AVERAGE_MAX_WEIGHT &&
                    secondCargoVolume < AVERAGE_MAX_VOLUME
        )
    )
}