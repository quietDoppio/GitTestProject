package lesson6_cycles

const val MILLS_IN_SECONDS: Long = 1000
fun main() {

    print("Введите кол-во секунд для отсчёта: ")
    var seconds = readln().toInt()

    while (seconds != 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(MILLS_IN_SECONDS)
    }
    println("Время вышло")

}