package assign1_june_07

fun main() {
    for (i in 1..10) {
        if (i % 3 == 0) {
            println("Order #$i is decaf. Skipping...")
            continue
        }
        println("Preparing coffee order #$i")
    }
}
