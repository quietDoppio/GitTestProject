package lesson6_cycles

const val MILLS_IN_SECONDS: Long = 1000
fun main() {

    print("Введите кол-во секунд для отсчёта: ")
    val seconds = readln().toLong()
    var counter = 0

    while (counter <= seconds) {
        println("Осталось секунд: ${seconds - counter++}")
        Thread.sleep(MILLS_IN_SECONDS)
    }
    println("Время вышло")

}