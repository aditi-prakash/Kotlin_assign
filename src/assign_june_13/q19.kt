package assign_june_13

fun main() {
    try {
        val result = 10 / 0
        println(result)
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero")
    }
}
