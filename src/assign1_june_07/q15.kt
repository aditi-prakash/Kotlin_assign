package assign1_june_07

fun main() {
    var stock = 10
    do {
        println("Stock remaining: $stock cup(s)")
        stock--
    } while (stock > 0)
    println("Inventory empty! Time to restock.")
}
