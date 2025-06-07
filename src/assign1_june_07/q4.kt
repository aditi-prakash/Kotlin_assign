package assign1_june_07

fun main() {
    var cupSize1 = "Small"
    var cupSize2 = "Large"
    println("Before swap: cupSize1 = $cupSize1, cupSize2 = $cupSize2")
    val temp = cupSize1
    cupSize1 = cupSize2
    cupSize2 = temp
    println("After swap: cupSize1 = $cupSize1, cupSize2 = $cupSize2")
}
