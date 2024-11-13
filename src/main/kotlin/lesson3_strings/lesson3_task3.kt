package lesson3_strings

fun main(){
    val figureToMultiplication = 5
    val multiplicationTable = """
        $figureToMultiplication * 1 = ${figureToMultiplication * 1}
        $figureToMultiplication * 2 = ${figureToMultiplication * 2}
        $figureToMultiplication * 3 = ${figureToMultiplication * 3}
        $figureToMultiplication * 4 = ${figureToMultiplication * 4}
        $figureToMultiplication * 5 = ${figureToMultiplication * 5}
        $figureToMultiplication * 6 = ${figureToMultiplication * 6}
        $figureToMultiplication * 7 = ${figureToMultiplication * 7}
        $figureToMultiplication * 8 = ${figureToMultiplication * 8}
        $figureToMultiplication * 9 = ${figureToMultiplication * 9}
    """.trimIndent()
    println(multiplicationTable)
}