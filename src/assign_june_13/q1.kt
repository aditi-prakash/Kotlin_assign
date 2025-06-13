package assign_june_13

fun main() {
    val numbers = (1..20).toList()
    val evens = numbers.filter { it % 2 == 0 }
    println(evens)
}
