package lesson7_for_range

const val MILLS_IN_SECONDS: Long = 1000
fun main() {
    print("Введите кол-во секунд: ")
    val timerRange = readln().toInt() downTo 0

    for (i in timerRange) {
        println(i)
        Thread.sleep(MILLS_IN_SECONDS)
    }
    println("Время вышло.")
}
