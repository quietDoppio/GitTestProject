package lesson2_arithmetic

fun main(){
    val permEmployeesSalaryCosts = 50*30000
    val allEmployeesSalaryCosts = permEmployeesSalaryCosts + (30*20000)
    val averageSalaryWithInterns = allEmployeesSalaryCosts/(50+30)

    println(permEmployeesSalaryCosts)
    println(allEmployeesSalaryCosts)
    println(averageSalaryWithInterns)
}