package assign2_june_08

fun sumMessage(x: Int, y: Int): String {
    val sum = x + y
    return "Sum of $x and $y is $sum"
}

fun main() {
    val a = 10
    val b = 15
    val message = sumMessage(a, b)
    println(message)
}
