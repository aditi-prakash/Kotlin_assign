package assign_june_13

fun main() {
    val numbers = listOf(1, 2, 3, 6, 4, 5)
    val taken = numbers.takeWhile { it < 5 }
    val dropped = numbers.dropWhile { it < 5 }
    println(taken)
    println(dropped)
}
