import kotlin.math.max

fun main() {
    val amount = 1000
    val minTarget = 35
    val rate = 0.75

    val result = max(((amount*rate) / 100).toInt(), minTarget)
    println("Комиссия за перевод составила $result рублей")
}