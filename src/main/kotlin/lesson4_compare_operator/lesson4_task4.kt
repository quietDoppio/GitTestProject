package lesson4_compare_operator

fun main() {
    val trainingDay = 5
    val trainingOrder = (trainingDay % 2) == 0

    val armsTraining = !trainingOrder
    val legsTraining = trainingOrder
    val spineTraining = trainingOrder
    val absTraining = !trainingOrder

    val trainingDayStatusText = """
            Упражнения для рук:   %b
            Упражнения для ног:   %b
            Упражнения для спины: %b
            Упражнения для пресса:%b
        """.trimIndent()

    println(String.format(trainingDayStatusText, armsTraining, legsTraining, spineTraining, absTraining))
}