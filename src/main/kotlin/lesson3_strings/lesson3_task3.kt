package lesson3_strings

fun main(){
    val figureToMultiplication = 5
    val multiplicationTable = """
        $figureToMultiplication x 1 = ${figureToMultiplication * 1}
        $figureToMultiplication x 2 = ${figureToMultiplication * 2}
        $figureToMultiplication x 3 = ${figureToMultiplication * 3}
        $figureToMultiplication x 4 = ${figureToMultiplication * 4}
        $figureToMultiplication x 5 = ${figureToMultiplication * 5}
        $figureToMultiplication x 6 = ${figureToMultiplication * 6}
        $figureToMultiplication x 7 = ${figureToMultiplication * 7}
        $figureToMultiplication x 8 = ${figureToMultiplication * 8}
        $figureToMultiplication x 9 = ${figureToMultiplication * 9}
    """.trimIndent()
    println(multiplicationTable)
}