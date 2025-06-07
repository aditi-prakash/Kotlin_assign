package assign1_june_07

fun main() {
    print("Enter your coffee order number: ")
    val orderNumber = readln().toIntOrNull() ?: 0
    if (orderNumber % 2 == 0) {
        println("Order #$orderNumber is even. Even numbers brew better!")
    } else {
        println("Order #$orderNumber is odd. Odd orders get extra foam!")
    }
}
