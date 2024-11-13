package lesson1_variables

fun main(){
    var countOfCurrentOrders: Short = 75
    val thanksMessageToClient: String = "Благодарим за покупку"
    println("Кол-во рабочих заказов: $countOfCurrentOrders, сообщение клиенту: $thanksMessageToClient")

    var countOfEmployees: Int = 2000
    //println("Количество работников интернет магазина: $countOfEmployees")
        countOfEmployees = 1999
        println("Количество работников интернет магазина: $countOfEmployees")

}