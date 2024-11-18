package lesson5_if_Else

const val CENTIMETERS_IN_METERS = 100
const val BMI_MIN = 18.5
const val BMI_NORMAL = 25
const val BMI_OVERAGE = 30

fun main() {

    print("Впшите ваш вес в кг: ")
    val weight = readln().toDouble()
    print("Впишите ваш рост в см: ")
    val height = readln().toFloat()

    val heightMeters = height / CENTIMETERS_IN_METERS
    val bmi = weight / (heightMeters * heightMeters)

    val weightCategory: String = when {
        (bmi < BMI_MIN) -> "недостаточная масса тела"
        (BMI_MIN <= bmi && bmi < BMI_NORMAL) -> "нормальная масса тела"
        (BMI_NORMAL <= bmi && bmi < BMI_OVERAGE) -> "избыточная масса тела"
        (bmi >= BMI_OVERAGE) -> "ожирение"
        else -> ""
    }
    println("У вас $weightCategory\n")
    println("Ваш ИМТ - ${"%.2f".format(bmi)}\nВаша категория веса - $weightCategory")
}