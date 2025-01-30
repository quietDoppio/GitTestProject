package lesson18_polymorphism

fun main() {
    val firstOrder = ClientOrder(123125)
    val secondOrder = ClientOrder(1000001)

    firstOrder.orderGoods("Товар0")
    secondOrder.orderGoods(listOf("Товар0", "Товар1", "Товар2"))
}

class ClientOrder(
    val orderNumber: Int,
) {

    fun orderGoods(goods: List<String>) {
        println("Заказаны следующие товары: $goods")
    }

    fun orderGoods(goods: String) {
        println("Заказан товар: $goods")
    }

}