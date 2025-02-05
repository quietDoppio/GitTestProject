package lesson21_extension

fun main() {
    val numsList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numsList.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    this.forEach {
        if (it % 2 == 0) sum += it
    }
    return sum
}