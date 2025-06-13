package assign_june_13

fun main() {
    val fruits = mutableListOf("Mango", "Banana", "Melon", "Apple", "Mandarin")
    fruits.removeAll { it.startsWith("M") }
    println(fruits)
}
