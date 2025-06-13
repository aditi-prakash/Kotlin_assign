package assign_june_13

fun main() {
    val items = listOf("apple", "banana", "cherry")
    items.forEachIndexed { index, item ->
        println("$index: $item")
    }
}
