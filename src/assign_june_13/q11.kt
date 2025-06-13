package assign_june_13

fun applyToInt(n: Int, op: (Int) -> Int): Int {
    return op(n)
}

fun main() {
    val result = applyToInt(5) { it * 2 }
    println(result)
}
