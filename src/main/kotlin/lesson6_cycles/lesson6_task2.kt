package lesson6_cycles

const val MILLS_IN_SECONDSS: Long = 1000
fun main() {

    print("Введите кол-во секунд для отсчёта: ")
    val seconds = readln().toLong()

    Thread.sleep(MILLS_IN_SECONDSS * seconds)

    println("Прошло $seconds секунд")

}