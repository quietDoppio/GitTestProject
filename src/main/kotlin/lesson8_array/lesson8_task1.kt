package lesson8_array

const val DAYS_IN_WEEK = 7
fun main() {
    val averageRangeOfAds = 2..20
    val viewedAds = IntArray(DAYS_IN_WEEK)
    var sumOfViewedAds = 0
    for (i in viewedAds) {
        viewedAds[i] = averageRangeOfAds.random()
        sumOfViewedAds += viewedAds[i]
    }
    println("Общее кол-во просмотренной рекламы за неделю: $sumOfViewedAds")
}
