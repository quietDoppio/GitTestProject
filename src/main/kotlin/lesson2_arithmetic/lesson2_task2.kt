package lesson2_arithmetic

fun main(){
    val permanentEmployees = 50
    val interns = 30
    val permEmployeesSalary = 30000
    val internsSalary = 20000

    val permEmployeesSalaryCosts = permanentEmployees * permEmployeesSalary
    val allEmployeesSalaryCosts = permEmployeesSalaryCosts + (interns * internsSalary)
    val averageSalaryWithInterns = allEmployeesSalaryCosts / (permanentEmployees + interns)

    println(permEmployeesSalaryCosts)
    println(allEmployeesSalaryCosts)
    println(averageSalaryWithInterns)
}