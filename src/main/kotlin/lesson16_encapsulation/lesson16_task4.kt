package lesson16_encapsulation

fun main() {
    val order = InternetOrder(842135512)
    order.sendNewStatus(true)
    order.sendNewStatus(false)
}

class InternetOrder(
    private val numberOfOrder: Int,
    private var statusOfOrder: Boolean = false,
) {
    fun sendNewStatus(newStatus: Boolean) {
        println("Заявка на смену статуса заказа: $numberOfOrder отправлена менеджеру")
        changeOrderStatus(newStatus)

    }

    private fun changeOrderStatus(newStatus: Boolean) {
        if (statusOfOrder != newStatus) {
            statusOfOrder = newStatus
            println("Заявка принята. Новый статус заказа - $statusOfOrder")
        } else {
            println("Заявка отклонена.")
        }
    }

}

