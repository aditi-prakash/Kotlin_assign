package assign_june_13

fun main() {
    val names = listOf("Alice", "Jonathan", "Eve", "Elizabeth", "Bob")
    val count = names.count { it.length > 5 }
    println(count)
}
