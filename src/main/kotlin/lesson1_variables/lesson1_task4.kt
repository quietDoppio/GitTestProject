package lesson1_variables

fun main(){
    val length: Long = 40_868_600_000L
    val age: Byte = 27
    val partOfDay: Float = 0.075F
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Short = 32700

    println("""
        $length
        $age
        $partOfDay
        $seconds
        $partOfYear
        $apogee
    """.trimIndent())
}