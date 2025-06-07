package assign1_june_07

fun main() {
    print("Enter the price of your coffee: ")
    val price = readln().toDoubleOrNull() ?: 0.0
    val message = when {
        price < 3 -> "That's a bargain brew!"
        price in 3.0..5.0 -> "Mid-range magic in a mug!"
        else -> "Luxury latte alert!"
    }
    println(message)
}
