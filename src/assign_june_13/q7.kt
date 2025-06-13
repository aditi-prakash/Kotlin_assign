package assign_june_13

fun main() {
    val items = mapOf("Laptop" to 1500, "Mouse" to 300, "Phone" to 800, "Keyboard" to 450)
    for ((item, price) in items) {
        if (price > 500)
            println("$item: $price")
    }
}
