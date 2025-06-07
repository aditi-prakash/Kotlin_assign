package assign1_june_07

fun main() {
    val basePrice = 5.0
    println("Discount Table:")
    for (discount in 10..50 step 10) {
        val discountedPrice = basePrice * (1 - discount / 100.0)
        println("$discount% off: $${"%.2f".format(discountedPrice)}")
    }
}
