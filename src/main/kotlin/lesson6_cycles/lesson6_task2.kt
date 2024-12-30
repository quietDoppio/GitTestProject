package lesson6_cycles

const val MILLS_IN_SECONDS: Long = 1000
fun main() {

    print("Введите кол-во секунд для отсчёта: ")
    val seconds = readln().toLong()

    Thread.sleep(MILLS_IN_SECONDS * seconds)

    println("Прошло $seconds секунд")

}