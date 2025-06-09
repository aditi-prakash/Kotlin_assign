package assign2_june_08

fun factorial(n: Int): Int {
    if (n <= 1) {
        return 1
    }
    return n * factorial(n - 1)
}

fun main() {
    val number = 5
    val result = factorial(number)
    println("Factorial of $number is $result")
}
