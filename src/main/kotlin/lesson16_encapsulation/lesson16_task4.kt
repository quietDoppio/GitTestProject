package lesson16_encapsulation

fun main() {
    val order = InternetOrder(842135512)
    order.changeOrderStatus(!order.getOrderStatus())
    println(order.getOrderStatus())
}

class InternetOrder(
    private val numberOfOrder: Int,
    private var statusOfOrder: Boolean = false,
) {
    fun changeOrderStatus(statusOfOrder: Boolean) {
        this.statusOfOrder = statusOfOrder
    }

    fun getOrderStatus(): Boolean = statusOfOrder
}