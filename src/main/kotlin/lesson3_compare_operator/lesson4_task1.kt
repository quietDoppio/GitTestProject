package lesson3_compare_operator

const val RESTAURANT_TABLES = 13

fun main(){
    val todayReservedTables = 13
    val tomorrowReservedTables = 9

        println("Доступность столиков на сегодня: ${todayReservedTables < RESTAURANT_TABLES}")
        println("Доступность столиков на завтра: ${tomorrowReservedTables < RESTAURANT_TABLES}")
}